/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_3;

/**
 *
 * @author ASUS
 */
public class Estudiante {

    private String identidad;
    private String name;
    private String apellido;
    private int edad;
    private String id_estudiante;
    private String carrera;
    
    public Estudiante(){
        
    }
    
    public Estudiante(int edad, String id_estudiante, String identidad, String name, String apellido,String carrera  ){
      this.setIdentidad(identidad);
      this.setName(name);
      this.setApellido(apellido);
      this.setEdad(edad);
      this.setId_estudiante(id_estudiante);
      this.setCarrera(carrera);
      
    }
    
    public String getidentidad(){
            return identidad;
    }
    
    public String getname(){
        return name;
    }
    
    public String getapellido(){
        return apellido;
    }
    
    public int getedad(){
        return edad;
    }
    
    public String getid_estudiante(){
        return id_estudiante;
    }
    
    public String getcarrera(){
        return carrera;
    }
    
    public void setIdentidad(String _identidad){
        this.identidad=_identidad;
    }

     public void setName(String _name){
        this.name=_name;
    }
      
     public void setApellido(String _apellido){
        this.apellido = _apellido;
    }
     
     public void setEdad(int _edad){
        this.edad=_edad;
}
      
     public void setId_estudiante(String _id_estudiante){
       this.id_estudiante=_id_estudiante;
    }
      
     public void setCarrera(String _carrera){
        this.carrera=_carrera;
    }
}
    

