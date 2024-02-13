package Herencia;

public class Automovil extends Vehiculo  {
   private String estilo;//Atributo especial, es decir solo aplica para Automovil

   public String getEstilo(){
      return "Estilo: "+ estilo;
  }
   public void registrarVehiculo(){ 
        super.registrarVehiculo();//hace referencia al método de la clase padre
        System.out.println("Ingrese el estilo del automovil:Clasico,Deportivos,4x4,Lujo");
        this.estilo=entrada.next();
   }
}
