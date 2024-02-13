package codigos.Expo;

import java.util.Scanner;

public class Exposicion {


    public static void main(String[] args) {
        Participante participantes[] = new Participante[3];
        Scanner sc = new Scanner(System.in);
        
        registrarParticipantes(participantes);
        
        verDatos(participantes);
        
        int opcion=0;
        
        do{
            System.out.println("Bienvenido elige una opcion: \n1. Folio y nombre del participante");
            System.out.println("2. Folio y nombre del los platillos\n3. Ver ingredientes");
            System.out.println("4. Salir");
            opcion=sc.nextInt();
        
            switch(opcion){
                case 1:
                    verFolioNombreP(participantes);
                break;
                case 2:
                    verFolioNombreC(participantes);
                break;
                case 3:
                    buscarFolio(participantes);
                break;
                case 4:opcion=4;
                break;
                default:System.out.println("NO VALIDO");
                break;
            }
        }while(opcion!=4);
        
    }
    
    public static void verFolioNombreP(Participante participante[]){
        String nombre1=participante[0].getNombre();
        int folio1=participante[0].getfolio();
        
        String nombre2=participante[1].getNombre();
        int folio2=participante[1].getfolio();
        
        String nombre3=participante[2].getNombre();
        int folio3=participante[2].getfolio();
        
        System.out.println("Nombre: "+nombre1+"\tFolio: "+folio1);
        System.out.println("Nombre: "+nombre2+"\tFolio: "+folio2);
        System.out.println("Nombre: "+nombre3+"\tFolio: "+folio3);
    }
    
    public static void verFolioNombreC(Participante participante[]){
        String nombre1=participante[0].verFolioNombre();     
        String nombre2=participante[1].verFolioNombre();      
        String nombre3=participante[2].verFolioNombre();
        
        System.out.println(nombre1);
        System.out.println(nombre2);
        System.out.println(nombre3);
    }
    
    public static void buscarFolio(Participante participante[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el folio: ");
        int folioB=sc.nextInt();
        
        int posicion=3;
        
        for(int i=0; i<participante.length; i++){
            if(folioB==participante[i].getfolio()){
                posicion=i;
            }
        }
        
        if(posicion==0||posicion==1||posicion==2){
            String cosas[]=participante[posicion].verIngredientes();
        
            for(int i=0; i<participante.length; i++){
                System.out.println(cosas[i]);
            }
        }else{
            System.out.println("NO ENCONTRADO");
        }
        
    }
    
    public static void registrarParticipantes(Participante participantes[]){
        Participante participante1 = new Participante();
        
        participante1.setNombre("Alexis");
        participante1.setOrigen("San Cristobal de las Casas");
        String ingredientes[]={"Tomate","Cebolla","Pollo"};
        participante1.costruirPlatillo("Mole", ingredientes);
        participantes[0]=participante1;
        
        Participante participante2 = new Participante();
        participante2.setNombre("Luis");
        participante2.setOrigen("Tuxtla Gutierez");
        String ingredientes1[]={"Carne","Zanahoria","Agua"};
        participante2.costruirPlatillo("Bistec", ingredientes1);
        participantes[1]=participante2;
        
        Participante participante3 = new Participante();
        participante3.setNombre("Elvia");
        participante3.setOrigen("CDMX");
        String ingredientes2[]={"Chipotle","Cebolla","Pollo"};
        participante3.costruirPlatillo("Tinga", ingredientes2); 
        participantes[2]=participante3;
    }
    
    public static void verDatos(Participante participante[]){
        String nombre1=participante[0].getNombre();
        String origen1=participante[0].getOrigen();
        int folio1=participante[0].getfolio();
        System.out.println("Nombre: "+nombre1+"\nOrigen: "+origen1+"\nFolio: "+folio1);
        String datos1=participante[0].verDatos();
        System.out.println(datos1);
        
        
        System.out.println("\n");
        
        String nombre2=participante[1].getNombre();
        String origen2=participante[1].getOrigen();
        int folio2=participante[1].getfolio();
        System.out.println("Nombre: "+nombre2+"\nOrigen: "+origen2+"\nFolio: "+folio2);
        participante[1].verDatos();
        String datos2=participante[1].verDatos();
        System.out.println(datos2);
        
        System.out.println("\n");
        
        String nombre3=participante[2].getNombre();
        String origen3=participante[2].getOrigen();
        int folio3=participante[2].getfolio();
        System.out.println("Nombre: "+nombre3+"\nOrigen: "+origen3+"\nFolio: "+folio3);
        String datos3=participante[2].verDatos();
        System.out.println(datos3);
        
        System.out.println("\n");
    }
}
