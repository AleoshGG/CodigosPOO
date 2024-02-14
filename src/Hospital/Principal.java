package Hospital;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Ernesto", -3);
        //System.out.println(paciente.getNombre()+" "+paciente.getEdad());
        
        registrarTratamiento(paciente);
    }
    
    public static void registrarTratamiento(Paciente paciente){
        Scanner sc = new Scanner(System.in);
        String nombreTratamiento;
        int cantidadMedicamentos;
        
        System.out.print("Ingrese el nombre del tratamiento:\n>>");
        nombreTratamiento = sc.nextLine();
        
        System.out.print("Ingrese la cantidad de medicamentos:\n>>");
        cantidadMedicamentos = sc.nextInt();
        
        for(int i=0; i<cantidadMedicamentos; i++){
        
        }
       
        paciente.getTratamiento().setNombre(nombreTratamiento); 
        System.out.println(paciente.getTratamiento().getNombre());
    }
    
}
