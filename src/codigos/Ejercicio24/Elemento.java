package codigos.Ejercicio24;


public class Elemento {
    //Declaramos los atributos de un elemento quimico
    private double pesoAtomico;
    private int numeroAtomos;
    
    public String validarDatos(double pesoAtomico, int numeroAtomos) {
        //Para las operaciones que realizaremos necesitamos el conjunto de los nuemros reales positivos 
        if (pesoAtomico > 0 && numeroAtomos > 0) {
            //Si la condicion se cumple podemos asignar los valores externos a nuestra clase, para poder
            //usarlos en las operaciones siguientes
            this.pesoAtomico = pesoAtomico;
            this.numeroAtomos = numeroAtomos;
        } else {
            //Si la condicion es F retornamos un mensaje de error
            return "Error";
        }
        //Si todo esta bien retornamos un menaje 
        return "Exito";
    }
    
    //Funciones GET para que en las otras clases pueda ver el valor de los atributos
    public double getPesoAtomico(){
        return pesoAtomico;
    }
    
    public int getNumeroAtomos(){
        return numeroAtomos;
    }
    
}
