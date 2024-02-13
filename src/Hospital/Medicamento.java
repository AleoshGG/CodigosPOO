package Hospital;

public class Medicamento {
    private String nombre;
    private String presentacion;
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setPresentacion(String presentacion){
        this.presentacion=presentacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getPresentacion(){
        return presentacion;
    }
}
