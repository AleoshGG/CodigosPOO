import java.util.ArrayList;

public class pruebas {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("Hola");
        lista.add("Adios");
        lista.add("Hola");
        lista.add("Adios");
        lista.add(2, "Insertado en un indice indicado");
        
        //lista.clear();//Limpia la lista 
        
        System.out.println(lista.isEmpty()); //Retorna true si la lista esta vacia
        
        lista.remove(4); //Elimina un elemento de la lista cuyo indice se pasa por parametro
        
        lista.set(0, "Elemento Remplazado"); //remplaza un elemnto 
        
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
    }
    
}
