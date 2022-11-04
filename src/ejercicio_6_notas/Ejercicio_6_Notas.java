/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6_notas;

/**
 *
 * @author ASUS
 */
public class Ejercicio_6_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota1=70,nota2=50;
        
        String nombre = "Victor";
        String nombre2 = "Carlos";
        
        if (nota1>=70 && nota2>=70)
        {
            System.out.println(nombre+" "+"ha Aprobado con un valor de: "+nota1+" "+"puntos");
            System.out.println(nombre2+" "+"ha Aprobado con un valor de: "+nota2+" "+"puntos");
        }else if (nota1<=69 && nota2 >=70)
        {
            System.out.println(nombre+" "+"ha Reprobado con un valor de: "+nota1+" "+"puntos");
            System.out.println(nombre2+" "+"ha Aprobado con un valor de: "+nota2+" "+"puntos");
        }else if (nota1>=70 && nota2<=69)
        {
            System.out.println(nombre+" "+"ha Aprobado con un valor de: "+nota1+" "+"puntos");
            System.out.println(nombre2+" "+"ha Reprobado con un valor de: "+nota2+" "+"puntos");
        }else
        {
            System.out.println(nombre+" "+"ha Reprobado con un valor de: "+nota1+" "+"puntos");
            System.out.println(nombre+" "+"ha Reprobado con un valor de: "+nota2+" "+"puntos");
        }
                
    }
        
        
        
        
       
    
}
