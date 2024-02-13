package codigos;

import java.util.Scanner;

public class EjemploArregloObjetos {

    
    public static void main(String[] args) {
        Persona grupoPersonas [] = new Persona [3];  //Declaracion e iniciacion de un arreglo de un tipo de dato
        
        modificarArreglo(grupoPersonas);
        mostrarArreglos(grupoPersonas);
    }
                                        //Parametro de tipo de dato
    public static void modificarArreglo(Persona grupoPersonas []){
        Scanner sc = new Scanner(System.in);
        
        String nombre="";
        int edad;
        Persona objetoPersona; //Declaracion del tipo de dato
        
        System.out.println("Ingresa la informacion");
        for(int i=0; i<grupoPersonas.length; i++){
            System.out.println("Nombre: ");
            nombre=sc.nextLine();
            System.out.println("Edad: ");
            edad=sc.nextInt();
            objetoPersona = new Persona(nombre,edad); //Inicializacion del tipo de dato
            grupoPersonas[i]=objetoPersona;
            sc.nextLine();
        }
    }
    
    public static void mostrarArreglos(Persona grupoPersonas []){
        System.out.println("Nombre\tEdad");
        for(int i=0; i<grupoPersonas.length; i++){
            grupoPersonas[i].mostrarDatos();
        }
    }
}
