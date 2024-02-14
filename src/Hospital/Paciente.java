package Hospital;

import java.util.Scanner;

public class Paciente {
    private String nombre;
    private int edad;
    private Tratamiento tratamiento = new Tratamiento();
    
    public Paciente(String nombre, int edad){
        this.nombre=nombre;
        this.edad=evaluarEdad(edad);
    }
    
    public int evaluarEdad(int edad){
        Scanner sc = new Scanner(System.in);
        
        while(edad<18){
            System.out.print("Error vuelve a ingresarlo\n>>");
            edad = sc.nextInt();
        }
        
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setTratamiento(Tratamiento tratamiento){
        this.tratamiento=tratamiento;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public Tratamiento getTratamiento(){
        return tratamiento;
    }
}
