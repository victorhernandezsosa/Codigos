/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5_arreglomultidimensional;

/**
 *
 * @author ASUS
 */
public class Ejercicio_5_Arreglomultidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String[]nombre= new String [5];
        
        nombre [0]="Victor";
        nombre [1]="Marco";
        nombre [2]="Kevin ";
        nombre [3]="Judy ";
        nombre [4]="Luis";
        
        String[]Apellido= new String [5];
        
        Apellido [0]="Hernandez";
        Apellido [1]="Diaz";
        Apellido [2]="Rivas";
        Apellido [3]="Castro";
        Apellido [4]="Vallecillo";
        
        String[]Carrera= new String [5];
        
        Carrera [0]="Tecnico en Desarrollo de Aplicaciones computacionales";
        Carrera [1]="Ingenieria en Computacion";
        Carrera [2]="Ingenieria Electronica";
        Carrera [3]="Ingenieria en Computacion";
        Carrera [4]="Ingenieria en Computacion";
        
        
        
        for (int a=0;a<5;a++)
        {
            System.out.println("El nombre del estudiante es "+nombre[a]+" "+Apellido[a]+" "+"y estudia la carrera de "+Carrera[a]);
        }
        
        /*No puse de que trabajaban ya que no pusieron eso en el foro xd*/
    
    
    }
    
}
