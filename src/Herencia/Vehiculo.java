package Herencia;

import java.util.Scanner;
public class Vehiculo {
    protected String modelo;
    protected String color;
    protected String marca;
    protected int precio;

    Scanner entrada= new Scanner (System.in);

    public Vehiculo(String modelo, String color, String marca, int precio){
        this.modelo=modelo;
        this.color=color;
        this.marca=marca;
        this.precio=precio;
    }
    public Vehiculo(){}

    protected void registrarVehiculo(){
        System.out.println("Ingrese el precio del vehiculo:");
        precio=entrada.nextInt(); 
        System.out.println("Ingrese el color del vehiculo:");
        color=entrada.next(); 
        entrada.nextLine(); 
        System.out.println("Ingresa la marca del vehiculo:"); 
        marca=entrada.nextLine();
        System.out.println("Ingresa el modelo del vehiculo:");
        modelo=entrada.nextLine();  
    }
    public String getMarca(){
        return marca;
    }
}
