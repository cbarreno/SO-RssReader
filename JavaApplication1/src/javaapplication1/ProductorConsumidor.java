/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Queue;

/**
 *
 * @author adrian
 */
public class ProductorConsumidor{
    private Queue cola;
    private boolean disponible=false;
    public ProductorConsumidor(Queue cola){
        this.cola = cola;
    }
    
    public synchronized  Queue getData(){
        while(!disponible){
            try {
                System.out.println("Dormido hilo Consumidor");
                wait();            
            } catch (InterruptedException ex) {
                //Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Despierto hilo consumidor");
        disponible=false;
        notify();
        return cola;
    }
    
    public synchronized void addQueue(String url){
        while(disponible){
            try {
                System.out.println("Dormido hilo productor");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        XmlParserRSS parser1 = new XmlParserRSS(url);
        Feed feed = parser1.readFeed();
        for (RSS message : feed.getMessages()) {
            cola.enqueue(message);
        }
        disponible = true;
        System.out.println("Despierto hilo productor");
        notify();
        
    }
}
