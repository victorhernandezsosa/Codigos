
package tarea_parte_1;

import Ayuda.Futbolista;

public class Tarea_parte_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Futbolista futbolista = new Futbolista("Victor Hernandez",20);
        
        futbolista.imprimirEdad();
        
        futbolista.setCarrera("Tecnico en Desarrollo de Aplicaciones Computacionales");
        
        System.out.println(futbolista.getCarrera());
        
    }
    
}
