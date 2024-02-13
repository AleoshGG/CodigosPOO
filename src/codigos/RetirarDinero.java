package codigos;

import java.util.Scanner;

public class RetirarDinero {
    double monto;
    int nip;
    Scanner sc = new Scanner(System.in);
    
    public void retirar(RegitrarCliente cliente){
        
        do{
        System.out.println("Ingrese su PIN: ");
        nip = sc.nextInt();
        if(nip!=cliente.pin){
                System.out.println("No valido");
            }
        }while(nip!=cliente.pin);
        
        do{
        System.out.println("Ingrese el monto a retirar: ");
        monto = sc.nextDouble();
        if(monto>cliente.saldo){
                System.out.println("No valido");
            }
        }while(monto>cliente.saldo);
        
        
        System.out.println("EXITO");
        darRetiro(monto,cliente);
    }
    
    public void darRetiro(double monto, RegitrarCliente cliente){
        System.out.println("El saldo actual es de: $"+(cliente.saldo-monto));
    }
}
