/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author adrian
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;

public class XmlParserRSS{

    private URL url;
 
    public XmlParserRSS(String feedUrl) {
        try {
            this.url = new URL(feedUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public Feed readFeed() {
        Feed feed = null;
        try {
            boolean isHeader = true;
            String description = "", title = "", link = "", language = "", copyright = "", author = "", pubdate = "", guid = "";  // Pregunta si el valor inicial es un string vacio

            XMLInputFactory inputFactory = XMLInputFactory.newInstance(); // Crea un XMLInputFactory
            InputStream lector;
            try {
                lector = url.openStream();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            XMLEventReader eventReader = inputFactory.createXMLEventReader(lector); // Inicializa un Reader

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    String localPart = event.asStartElement().getName().getLocalPart();

                    switch (localPart) {
                        case "item":
                            if (isHeader) {
                                isHeader = false;
                                feed = new Feed(title, link, description, language, copyright, pubdate);
                            }
                            event = eventReader.nextEvent();
                            break;

                        case "title":
                            title = getCharacterData(event, eventReader);
                            break;

                        case "description":
                            description = getCharacterData(event, eventReader);
                            break;

                        case "language":
                            language = getCharacterData(event, eventReader);
                            break;

                        case "author":
                            author = getCharacterData(event, eventReader);
                            break;

                        case "link":
                            link = getCharacterData(event, eventReader);
                            break;

                        case "guid":
                            guid = getCharacterData(event, eventReader);
                            break;

                        case "pubDate":
                            pubdate = getCharacterData(event, eventReader);
                            break;

                        case "copyright":
                            copyright = getCharacterData(event, eventReader);
                            break;
                    }
                } else if (event.isEndElement()) {
                    if (event.asEndElement().getName().getLocalPart() == ("item")) {
                        RSS tagRss = new RSS();
                        tagRss.setGuid(guid);
                        tagRss.setAuthor(author);
                        tagRss.setPubDate(pubdate);
                        tagRss.setDescription(description);
                        tagRss.setLink(link);
                        tagRss.setTitle(title);

                        feed.getMessages().add(tagRss);
                        event = eventReader.nextEvent();
                        continue;
                    }
                }
            }
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }
        return feed;
    }

    private String getCharacterData(XMLEvent event, XMLEventReader eventReader) throws XMLStreamException {
        String caracter = "";
        event = eventReader.nextEvent();
        if (event instanceof Characters) {
            caracter = event.asCharacters().getData();
        }
        return caracter;
    }
    }
