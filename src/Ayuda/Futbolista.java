/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ayuda;

/**
 *
 * @author ASUS
 */
public class Futbolista {
    public String nombre;
    private int edad;
    public String carrera;
    
    //constructor
    public Futbolista (String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
    public void imprimirEdad(){
        System.out.println(edad);
    }
    
    public void setCarrera(String _carrera){
        this.carrera=_carrera;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    
}

