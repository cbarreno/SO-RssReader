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
 * @author DELL
 */
public class Cronometro extends Thread {

    public Cronometro(){
        
    }


    public void run(){
        Integer minutos = JavaApplication1.tiempoConexion , segundos = 0, milesimas = 0;
        //min es minutos, seg es segundos y mil es milesimas de segundo
        String min="", seg="";
        try
        {
            //Mientras cronometroActivo sea verdadero entonces seguira
            //aumentando el tiempo
            while(JavaApplication1.cronometroActivo)
            {
                Thread.sleep( 4 );
                //Incrementamos 4 milesimas de segundo
                milesimas += 4;
                 
                //Cuando llega a 1000 osea 1 segundo aumenta 1 segundo
                //y las milesimas de segundo de nuevo a 0
                if( milesimas == 1000 )
                {
                    if(minutos==0 && segundos ==0){
                    GUI.MostrarFeed();
                    minutos = JavaApplication1.tiempoConexion;
                    }
                    if( segundos == 0 )
                    {
                        segundos = 60;
                        minutos--;
                    }
                    milesimas = 0;
                    segundos -= 1;
                    //Si los segundos llegan a 60 entonces aumenta 1 los minutos
                    //y los segundos vuelven a 0
                    
                }
 
                //Esto solamente es estetica para que siempre este en formato
                //00:00:000
                if( minutos < 10 ) min = "0" + minutos;
                else min = minutos.toString();
                if( segundos < 10 ) seg = "0" + segundos;
                else seg = segundos.toString();
                
                 
                //Colocamos en la etiqueta la informacion
                GUI.tiempo.setText( min + ":" + seg);                
            }

        }catch(Exception e){}
        //Cuando se reincie se coloca nuevamente en 00:00:000
        GUI.tiempo.setText(JavaApplication1.tiempoConexion + ":00");
    }

    
}
