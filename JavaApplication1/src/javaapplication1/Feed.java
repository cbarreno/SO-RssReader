/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cris
 */
public class Feed {

    private String title;
    private String link;
    private String description;
    private String pubDate;
    private String language;
    private String copyright;

    final List<RSS> entries = new ArrayList<RSS>();

    public Feed(String title, String link, String description, String language, String copyright, String pubDate) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubDate = pubDate;
        this.language = language;
        this.copyright = copyright;
    }

    @Override
    public String toString() {
        return "\n FEED [Copyright:" + copyright + ", Description:" + description + ", Language:" + language + ", Link:" + link + ", PubDate:" + pubDate + ", Title:" + title + "]\n";
    }

    public List<RSS> getMessages() {
        return entries;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

}
