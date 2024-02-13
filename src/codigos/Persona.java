package codigos;

public class Persona {
    private String nombrePersona;
    private int edadPersona;
    
    public Persona(){}
    
    public Persona(String nombre, int edad){
        this.nombrePersona=nombre;
        this.edadPersona=edad;
    }
    
    public String getNombre(){
        return nombrePersona;
    }
    
    public int getEdad(){
        return edadPersona;
    }
    
    public void mostrarDatos(){
        System.out.println(getNombre()+"\t"+getEdad());
    }
    
}
