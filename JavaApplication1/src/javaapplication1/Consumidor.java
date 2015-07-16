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

/**
 *
 * @author adrian
 */
public class Consumidor extends Thread{
    private ProductorConsumidor pc;
    private Stack pilaCon;
    public Consumidor(ProductorConsumidor pc){
        this.pc = pc;
    }
    
    @Override
    public void run(){
        
        //System.out.println("Inicio hilo consumidor");
        pilaCon = pc.getData();
        System.out.println("Nueva FEED");
        while (!pilaCon.isEmpty()){
            RSS message;
            message = (RSS)pilaCon.pop();
            GUI.Texto.append(message.toString());
            GUI.Texto.append("\n");
        }
        try {
           sleep(400);
       } catch (InterruptedException ex) {
           Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
       }
        //System.out.println("Fin hilo consumidor");
    }
    
}
