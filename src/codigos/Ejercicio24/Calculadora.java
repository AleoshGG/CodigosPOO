package codigos.Ejercicio24;

import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        int salida=0;
        Scanner sc = new Scanner(System.in);
        
        do{
            Calculo calculo = new Calculo();

            darDatos(calculo);
            verResultados(calculo);
            
            System.out.println("Para salir pulse: 0");
            salida = sc.nextInt();
        }while(salida!=0);
    }
    
    public static void darDatos(Calculo calculo){
        Scanner sc = new Scanner(System.in);
        int numeroElementos = 0;
        double gramos = 0;
        
        do{
            System.out.println("\tBienvenido a la calculadora \nIngresa el numero de elementos del compuesto");
            System.out.println("MAXIMO 4: ");
            numeroElementos = sc.nextInt();
        }while(numeroElementos<2 || numeroElementos>4);
        
        calculo.costruirCompuesto(numeroElementos);
        calculo.calcularVariables(numeroElementos);
        
        System.out.println("Ingrese los gramos del compuesto: ");
        gramos = sc.nextDouble();
        
        calculo.calcularResultados(gramos);
    }
    
    public static void verResultados(Calculo calculo){
        double atomosContenidos = calculo.verAtomosContenidos();
        double moleculasContenidas = calculo.verMoleculasContenidas();
        
        System.out.println("Moleculas contenidas en "+calculo.gramos+"g del compuesto: "+moleculasContenidas+"x10^23");
        System.out.println("Atomos contenidos en "+calculo.gramos+"g del compuesto: "+atomosContenidos+"x10^23");
    }
}
