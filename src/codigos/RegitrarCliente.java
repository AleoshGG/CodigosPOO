package codigos;

import java.util.Scanner;
import java.util.Random;

public class RegitrarCliente {
    
    //Creacion de un tipo de dato
    Cuenta objCliente = new Cuenta();
    double saldo;
    String nombre;
    int cuenta=0;
    int pin=0;
    int targeta=0;
    
    public void leerDatos(){
        //Creacion de variables locales 
        
        Scanner sc = new Scanner(System.in);
        
        //Obtencion de datos 
        System.out.println("\nIngrese su nombre completo: ");
        nombre = sc.nextLine();
       
        //Validar saldo
        do{
            System.out.println("Ingrese el saldo inicial de su cuenta: ");
            saldo = sc.nextDouble();
            if(saldo<=0){
                System.out.println("No valido");
            }
        }while(saldo<=0);
        
    }
    
    public void generarCuenta(){
        //Creacion de variables
        Random numeros = new Random();
        
        //Generacion de numeros aleatoreos positivos 
        do{
            int minimo = (int) Math.pow(10, 8 - 1);
            int maximo = (int) Math.pow(10, 8) - 1;  
            
            cuenta = numeros.nextInt(maximo - minimo + 1) + minimo;
        }while(cuenta<0);
        
    }
    
    public void generarPin(){
        //Lo mismo que la cuenta pero mas barato 
        Random numeros = new Random();
        
        //Generacion de numeros aleatoreos positivos 
        do{
            int minimo = (int) Math.pow(10, 4 - 1);
            int maximo = (int) Math.pow(10, 4) - 1;  
            
            pin = numeros.nextInt(maximo - minimo + 1) + minimo;   
        }while(pin<0);
        
    }
    
    public void generarTargeta(){
        //Lo mismo que la cuenta pero mas barato 
        Random numeros = new Random();
        
        //Generacion de numeros aleatoreos positivos 
        do{
            int minimo = (int) Math.pow(10, 10 - 1);
            int maximo = (int) Math.pow(10, 10) - 1;  
            
            targeta = numeros.nextInt(maximo - minimo + 1) + minimo;    
        }while(targeta<0);
        
    }
    
    public void crearCliente(){
        generarCuenta();
        objCliente.setCuenta(cuenta);
        generarPin();
        objCliente.setPin(pin);
        generarTargeta();
        objCliente.setTargeta(targeta);
        leerDatos();
     //   objCliente.setNombre(nombre);
        objCliente.setSaldo(saldo);
    }
    
    public void verCliente(){
        //System.out.println(objCliente.getDatos());
    }
    
}
