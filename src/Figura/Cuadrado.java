package Figura;

public class Cuadrado extends Figura{
    
    public Cuadrado(float base){
        super.setBase(base);
    }
    
    public String calcularArea(){
        float areaCuadrado = super.getBase()*super.getBase();
        return "El area del cuadrado es de: "+areaCuadrado+" U^2";
    }
}
