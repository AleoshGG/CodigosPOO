package Figura;

public class Triagulo extends Figura{
    private float altura;
    
    public Triagulo(float base, float altura){
        super.setBase(base);
        this.altura=altura;
    }
    
    public Triagulo(){}
    
    public String calcularArea(){
        float areaTriangulo = (super.getBase()*altura)/2;
        return "El area del triangulo es de: "+areaTriangulo+" U^2";
    }
    
}
