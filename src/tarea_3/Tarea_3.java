/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_3;

/**
 *
 * @author ASUS
 */
public class Tarea_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante = new Estudiante();
        
        estudiante.setIdentidad("0501200303953");
        estudiante.setName("Victor David");
        estudiante.setApellido(" Hernandez Sosa");
        estudiante.setEdad(19);
        estudiante.setId_estudiante("202210010747");
        estudiante.setCarrera("Tecnico en Desarrollo de Aplicaciones Computacionales");
        
        System.out.println("La identidad del estudiante es: "+estudiante.getidentidad());
        System.out.println("El nombre del estudiante es: "+estudiante.getname()+estudiante.getapellido());
        System.out.println("La edad del estudiante es de: "+estudiante.getedad());
        System.out.println("El id del estudiante es: "+estudiante.getid_estudiante());
        System.out.println("La carrera del estudiante es: "+estudiante.getcarrera());
        
       
        
    }
    
}
