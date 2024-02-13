package Hospital;

import java.util.ArrayList;

public class Tratamiento {
    private String nombre;
    private float costo;
    private ArrayList<Medicamento> listaMedicamentos;
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setCosto(float costo){
        this.costo=costo;
    }
    
    public void setListaMedicamentos(Medicamento medicamento){
        listaMedicamentos.add(medicamento);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public float getCosto(){
        return costo;
    }
    
    public ArrayList getListaMedicamentos(){
        return listaMedicamentos;
    }
}
