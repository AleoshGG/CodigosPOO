package Herencia;

public class Autobus extends Vehiculo{
    private int numPasajeros;

    public int getnumPasajeros(){
        return numPasajeros;
    }
    public void registrarVehiculo(){ 
        super.registrarVehiculo();
        System.out.println("Ingrese la capacidad maxima de pasajeros:");
        this.numPasajeros=validar(entrada.nextInt());
   }

   public int validar(int numPasajeros){
    while(numPasajeros<=0){
        System.out.println("Vuelva a intentarlo");
        numPasajeros=entrada.nextInt();
    }
    return numPasajeros;
   }
}
