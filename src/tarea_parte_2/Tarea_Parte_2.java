/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_parte_2;

import Ayuda.Alemania;
import Ayuda.España;
import Ayuda.Honduras;



/**
 *
 * @author ASUS
 */
public class Tarea_Parte_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alemania alemania= new Alemania();
        España españa = new España();
        Honduras honduras = new Honduras();
        
        System.out.println(alemania.getEquipo());
        System.out.println(alemania.getCapitan());
        
        System.out.println(" ");
        
        System.out.println(españa.getEquipo());
        System.out.println(españa.getCapitan());
        
        System.out.println(" ");
        
        System.out.println(honduras.getEquipo());
        System.out.println(honduras.getCapitan());
        
    }
    
}
