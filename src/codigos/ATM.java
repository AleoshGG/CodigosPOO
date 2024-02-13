package codigos;

import java.util.Scanner;

public class ATM {


    public static void main(String[] args) {
        int opcion=0;
        Scanner sc = new Scanner(System.in);
        Cuenta listaCuentas [] = new Cuenta[3];
        
        inicializarObjetos(listaCuentas);
        
        listaCuentas[0].verDatos();
        
        /*System.out.println("Bienbenido");
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Salir");
        opcion = sc.nextInt();
        
        if(opcion==1){
            
           // cliente.crearCliente();
            //PRUEBAS 
         //   cliente.verCliente();
            
            System.out.println("EXITO");
            System.out.println("Elija una opcion: ");
            System.out.println("1. Retirar Efectivo");
            System.out.println("2. Consultar Saldo");
            opcion = sc.nextInt();
            
            if(opcion==2){
                Consulta consulta = new Consulta();
          //      consulta.obtenerSaldo(cliente);
            }else if(opcion==1){
                RetirarDinero retiro = new RetirarDinero();
           //     retiro.retirar(cliente);
            }
        }*/
        
        
        
        
    }
    
    public static void inicializarObjetos(Cuenta lista[]){
        Cliente cliente = new Cliente("Alexis Guzman");
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setCuenta(12345678);
        cuenta1.setPin(4321);
        cuenta1.setSaldo(1500);
        cuenta1.setTargeta(123456789);
        lista[0]=cuenta1;
        
        Cliente cliente1 = new Cliente("Limberg del Valle");
        Cuenta cuenta2 = new Cuenta();
        cuenta2.setCuenta(12345678);
        cuenta2.setPin(1234);
        cuenta2.setSaldo(1500);
        cuenta2.setTargeta(123456789);
        lista[0]=cuenta2;
        
        Cliente cliente2 = new Cliente("Ernesto Montes");
        Cuenta cuenta3 = new Cuenta();
        cuenta3.setCuenta(12345678);
        cuenta3.setPin(1423);
        cuenta3.setSaldo(1500);
        cuenta3.setTargeta(123456789);
        lista[0]=cuenta3;
        
    }
    
}
