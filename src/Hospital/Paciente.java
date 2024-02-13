package Hospital;

public class Paciente {
    private String nombre;
    private int edad;
    private Tratamiento tratamiento;
    
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
