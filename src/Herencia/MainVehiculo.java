package Herencia;

import Herencia.Automovil;
import Herencia.Autobus;
import java.util.ArrayList;

public class MainVehiculo {
    public static void main(String[] args) {
        
        ArrayList<Vehiculo> listaVehiculos = new ArrayList();
        Automovil vehiculo1 = new Automovil();
        Bicicleta vehiculo2 = new Bicicleta();
        Autobus vehiculo3 = new Autobus();

        vehiculo1.registrarVehiculo();
        vehiculo2.registrarVehiculo();
        vehiculo3.registrarVehiculo();

        listaVehiculos.add(vehiculo1);
        listaVehiculos.add(vehiculo2);
        listaVehiculos.add(vehiculo3);

        verInformacion(listaVehiculos);
    }

    public static void verInformacion(ArrayList<Vehiculo> lista) {
        for (int i = 0; i < lista.size(); i++) 
            System.out.println(i + 1 + " " + lista.get(i).getMarca());
    }
}