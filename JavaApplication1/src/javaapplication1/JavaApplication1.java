/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Cris
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
       
    public static Stack pilaFeed;
    public static LinkedList<String> ListURL;
    public static void main(String[] args) {
        ListURL=new LinkedList<String>();
        pilaFeed = new Stack();
        
        //LinkedList 
        GUI gui=new GUI();
        // long initialTime = System.currentTimeMillis();       http://www.20minutos.es/rss/artrend
        
        // XmlParserRSS parser1 = new XmlParserRSS("http://www.eluniverso.com/rss/opinion.xml");
        // XmlParserRSS parser2 = new XmlParserRSS("http://rss.cnn.com/rss/edition.rss");        
        
        // Feed feed1 = parser1.readFeed();
        // Feed feed2 = parser2.readFeed();
        
        // System.out.println(feed1);
        // for (RSS message : feed1.getMessages()) {
            // System.out.println(message);

        // }        
        
        // System.out.println(feed2);
        // for (RSS message2 : feed2.getMessages()) {
            // System.out.println(message2);

        // }

    }

}
