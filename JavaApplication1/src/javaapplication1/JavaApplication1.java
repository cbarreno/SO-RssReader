/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.LinkedList;
import java.util.Stack;
import sun.misc.Queue;

/**
 *
 * @author Cris
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static Queue colaFeed;
    public static Cronometro cronometro;
    public static int tiempoConexion = 1;
    public static boolean estaActivo = false;
    public static boolean cronometroActivo = true;
    public static LinkedList<String> ListURL;
    public static void main(String[] args) {
        ListURL=new LinkedList<String>();
        colaFeed = new Queue();
        
        GUI gui=new GUI();
           }

}
