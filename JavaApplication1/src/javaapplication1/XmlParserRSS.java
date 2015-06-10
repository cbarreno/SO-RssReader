/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;

public class XmlParserRSS {

    private URL url;
    
    public XmlParserRSS(String feedUrl) {
        try {
          this.url = new URL(feedUrl);
        } catch (MalformedURLException e) {
          throw new RuntimeException(e);
        }
    }
    
   
} 


