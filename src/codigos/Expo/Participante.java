package codigos.Expo;

import java.util.Random;


public class Participante {
    private String nombre;
    private String origen;
    private int folio;
    Platillo platillo = new Platillo();
    
    public Participante(){   
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setOrigen(String origen){
        this.origen=origen;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getOrigen(){
        return origen;
    }
    
    public void generarFolio(){
        Random numeros = new Random();
        
        //Generacion de numeros aleatoreos positivos 
        do{
            int minimo = (int) Math.pow(10, 3 - 1);
            int maximo = (int) Math.pow(10, 3) - 1;  
            
            folio = numeros.nextInt(maximo - minimo + 1) + minimo;
        }while(folio<0);
    }
    
    public int getfolio(){
        return folio;
    }
    
    public void costruirPlatillo(String nombre, String ingredientes[]){
        generarFolio();
        platillo.setFolio(folio);
        platillo.setIngredientes(ingredientes);
        platillo.setNombre(nombre);
    }
    
    public String verDatos(){
        String name=platillo.getNombre();
        String cosas[]=platillo.getIngredientes();
        int folioo=platillo.getFolio();
        String info="Platillo: "+name+"\nIngredientes: "+cosas[0]+"\nFolio: "+folioo;
        return info;
    }
    
    public String verFolioNombre(){
        String name=platillo.getNombre();
        int folioo=platillo.getFolio();
        String info="Platillo: "+name+"\tFolio: "+folioo;
        return info;
    }
    
    public String[] verIngredientes(){
        String cosas[]=platillo.getIngredientes();
        
        return cosas;
    }
}
