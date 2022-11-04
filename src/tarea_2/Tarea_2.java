package tarea_2;

public class Tarea_2 {

    public static void main(String[] args) {

        Recursos recursos = new Recursos();
        recursos.Saludo();
        recursos.edad(10);
        recursos.multi(20, 2);
        recursos.lista (10);
        
    }
    
    public static class Recursos {
        public void Saludo(){
            System.out.println("Programacion Orientada a Objetos 2021");
        }
        
        public void edad (int x){
            if (x >=18){
                System.out.println("Eres mayor de edad");
            }else{
                System.out.println("Eres menor de edad");
            }
        }
        
        public void multi(int n1,int n2){
            int multiplicacion;
            
            multiplicacion=n1*n2;
            
            System.out.println("El resultado de la multiplicacion entre "+n1+" * "+n2+" es de: "+multiplicacion);    
        }
        
        public void lista(int a){
            
            System.out.println("Lista de Numeros");
            for (int l=1;l<=a;l++)
            {
                System.out.println(l);
            }
        }
    }
    
}
