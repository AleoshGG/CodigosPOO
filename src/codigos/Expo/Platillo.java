package codigos.Expo;


public class Platillo {
    private String nombre;
    private String ingredientes[];
    private int folio;
    
    public Platillo(){
        
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setIngredientes(String ingredientes[]){
        this.ingredientes=ingredientes;
    }
    
    public void setFolio(int folio){
        this.folio=folio;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String[] getIngredientes(){
        return ingredientes;
    }
    
     public int getFolio(){
        return folio;
    }
}
