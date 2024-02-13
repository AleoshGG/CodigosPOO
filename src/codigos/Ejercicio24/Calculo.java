package codigos.Ejercicio24;

import java.util.Scanner;

public class Calculo {
    double gramos;
    private double AVOGADRO;
    private int atomosCompuesto;
    private double pesoMolecular;
    private double atomosContenidos;
    private double moleculasContenidas;
    private Elemento compuesto[] = new Elemento[4]; 
    
    public Calculo () {
        AVOGADRO = 6.022;
    }
    
    public void pedirDatos(Elemento elemento, int i){
        Scanner sc = new Scanner(System.in);
      
        //Tenemos que hacer nuestro compuesto, que es un arreglo de elementos quimicoa 
        //Tinen Peso Atomico, y un Numero de Atomos 
        double pesoAtomico = 0;
        int numeroAtomos = 0;
        
        System.out.println("Ingrese el peso atomico "+(i+1)+": ");
        pesoAtomico = sc.nextDouble();
        System.out.println("Ingrese el numero de atomos "+(i+1)+": ");
        numeroAtomos = sc.nextInt();
        //crear el elemento y meterlo al arreglo
        String mensaje = elemento.validarDatos(pesoAtomico, numeroAtomos);
        //Tenemos que recibir el mensaje de Exito, para saber que son validos
        if (mensaje != "Exito"){
            System.out.println("No valido, vuelve a empezar");
            pedirDatos(elemento,0);
        }else{
            compuesto[i]=elemento;
        }
       
    }
    
    public void costruirCompuesto(int numeroElementos){
        switch(numeroElementos){
            case 2:
                Elemento elemento1 = new Elemento();
                pedirDatos(elemento1,0);
                Elemento elemento2 = new Elemento();
                pedirDatos(elemento2,1);
            break;
            case 3:
                Elemento elemento3 = new Elemento();
                pedirDatos(elemento3,0);
                Elemento elemento4 = new Elemento();
                pedirDatos(elemento4,1);
                Elemento elemento5 = new Elemento();
                pedirDatos(elemento5,2);
            break;
            case 4:
                Elemento elemento6 = new Elemento();
                pedirDatos(elemento6,0);
                Elemento elemento7 = new Elemento();
                pedirDatos(elemento7,1);
                Elemento elemento8 = new Elemento();
                pedirDatos(elemento8,2);
                Elemento elemento9 = new Elemento();
                pedirDatos(elemento9,3);
            break;
            default: System.out.println("Error");
            break;
        }
        
        
    }
    
    public void calcularVariables(int numeroElementos){
        //Debemos calcular las variables que necesita para llegar a los resultados
        
        //CALCULAR:  los atomos del compuesto:
        for (int i=0; i<numeroElementos; i++) {
            this.atomosCompuesto+=compuesto[i].getNumeroAtomos();
        }
        
        //CALCULAR: Peso Molecular
        for (int i=0; i<numeroElementos; i++) {
            this.pesoMolecular+=(compuesto[i].getNumeroAtomos()*compuesto[i].getPesoAtomico());
        }

    }
    
    public void calcularResultados(double gramos){
        //Validamos que los gramos sean > 0, es decir positivos
        
        if (gramos>0) {
            this.gramos=gramos;
            this.atomosContenidos = ((gramos/pesoMolecular)*atomosCompuesto)*AVOGADRO;
            this.moleculasContenidas = ((gramos*AVOGADRO)/pesoMolecular)/10;
        }else{
            System.out.println("Vuleve a intentarlo");
        }
        
    }
    
    public double verAtomosContenidos(){
        return atomosContenidos;
    }
    
    public double verMoleculasContenidas(){
        return moleculasContenidas;
    }
}
