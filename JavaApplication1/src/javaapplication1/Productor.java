/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import sun.awt.windows.ThemeReader;

/**
 *
 * @author adrian
 */
public class Productor extends Thread{
    private String url;
    public Productor(String url){
        this.url = url;
    }
    
    public synchronized void addStack(Feed feed){
        for (RSS message : feed.getMessages()) {
            JavaApplication1.pilaFeed.push(message);
        }
    }

    @Override
    public void run(){
        System.out.println("Inicio hilo prodcutor");
        XmlParserRSS parser = new XmlParserRSS(url);
        Feed feed = parser.readFeed();
        addStack(feed);
        System.out.println("Fin de Hilo productor");       
                
    }
}
