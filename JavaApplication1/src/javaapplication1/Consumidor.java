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
public class Consumidor extends Thread{
    
    
    public synchronized void getData(){
        while (!JavaApplication1.pilaFeed.isEmpty()){
                    RSS message;
                    message = (RSS)JavaApplication1.pilaFeed.pop();            
                    GUI.Texto.append(message.toString());
                    GUI.Texto.append("\n");

                }
    }
    
    @Override
    public void run(){
        System.out.println("Inicio hilo consumidor");
        if (this.isInterrupted())
            System.out.println("Está interrumpido");
        getData();
        System.out.println("Fin hilo consumidor");
    }
    
}
