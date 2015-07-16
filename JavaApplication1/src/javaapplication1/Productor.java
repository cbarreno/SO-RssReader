/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adrian
 */
public class Productor extends Thread{
    private String url;
    ProductorConsumidor pc;
    public Productor(String url,ProductorConsumidor pc){
        this.url = url;
        this.pc = pc;
    }
    
    

    @Override
    public void run(){
            //Verifico si es personal que esta es jefe o no            
                //System.out.println("Inicio hilo prodcutor");
                pc.addStack(url);
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                }
                //System.out.println("Fin de Hilo productor"); 
            }         
    }
