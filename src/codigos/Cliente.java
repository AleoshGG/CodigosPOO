package codigos;


public class Cliente {
    
    //definiendo los atributos de la clase 
    private String nombre;
    
    public Cliente(){
        
    }
    
    public Cliente(String nombre){
        this.nombre=nombre;
    }
    
    //metodos GET para el uso de datos;
    public String getNombre(){
        return nombre;
    }
    
}
