package Figura;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList(); 
        verMenu(figuras);
    }
    
    public static void verMenu(ArrayList<Figura> figuras){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do{
        
        System.out.println("Ingrese una opcion: ");
        System.out.println("1. Ingresar datos");
        System.out.println("2. Calcular Area");
        System.out.print(">> ");
        opcion = sc.nextInt();
        
        switch(opcion){
            case 1: ingresarFigura(figuras);
            break;
            case 2: calcularArea(figuras);
            break;
            default: System.out.println("NO VALIDO");
            break;
        }
        }while(opcion == 1 || opcion == 2);
        
    }
    
    public static void ingresarFigura(ArrayList<Figura> figuras){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println("Elija la opcion que desee: ");
        System.out.println("1. Ingresar un cuadrado\n2. Ingresar un triangulo");
        System.out.print(">> ");
        opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Ingresa la medida de un lado del cuadrado: ");
                float lado = sc.nextFloat();
                Cuadrado cuadrado = new Cuadrado(lado);
                figuras.add(cuadrado);     
            break;
            case 2:
                System.out.println("Ingresa la medida de la base del triangulo: ");
                float base = sc.nextFloat();
                System.out.println("Ingresa la medida de la altura del triangulo: ");
                float altura = sc.nextFloat();
                Triagulo triangulo = new Triagulo(base,altura);
                figuras.add(triangulo);
            break;
            default: System.out.println("NO VALIDO");
            break;
        }
        
    }
    
    public static void calcularArea(ArrayList<Figura> figuras){
        for (int i = 0; i < figuras.size(); i++) {
            System.out.println(figuras.get(i).calcularArea());
        }
    }

}
