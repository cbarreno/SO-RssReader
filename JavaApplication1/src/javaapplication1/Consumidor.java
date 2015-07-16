/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static java.lang.Thread.sleep;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Queue;

/**
 *
 * @author adrian
 */
public class Consumidor extends Thread{
    private ProductorConsumidor pc;
    private Queue colaCon;
    public Consumidor(ProductorConsumidor pc){
        this.pc = pc;
    }
    
    @Override
    public void run(){
        
        System.out.println("Inicio hilo consumidor");
        colaCon = pc.getData();
        System.out.println("Nueva FEED");
        while (!colaCon.isEmpty()){
            try {
                RSS message;
                message = (RSS)colaCon.dequeue();
                GUI.Texto.append(message.toString());
                GUI.Texto.append("\n");
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
           sleep(400);
       } catch (InterruptedException ex) {
           Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
       }
        System.out.println("Fin hilo consumidor");
    }
    
}
