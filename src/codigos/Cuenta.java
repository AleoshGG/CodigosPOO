package codigos;


public class Cuenta {
    private int cuenta;
    private int pin;
    private int targeta;
    private double saldo;
    Cliente objCliente;
        
    public void setCliente(Cliente cliente){
        this.objCliente=cliente;
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    public void setCuenta(int cuenta){
        this.cuenta=cuenta;
    }
    
    public void setPin(int pin){
        this.pin=pin;
    }
    
    public void setTargeta(int targeta){
        this.targeta=targeta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public int getCuenta(){
        return cuenta;
    }
    
    public int getPin(){
        return pin;
    }
    
    public int getTargeta(){
        return targeta;
    }
    
    public Cliente getCliente(){
        return objCliente;
    }
    
    public String verDatos(){
        return "Nombre: "+cuenta;
    }
}
