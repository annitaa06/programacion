package ppo3.figura;

public class Cuadrado extends Rectangulo {
    private double lado;

    public Cuadrado(double lado){
        super(lado, lado);

        this.lado=lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public double area(){
        return lado * lado;
    }
    public double perimetro(){
        return 4*lado;
    }
    public String toString(){
        return "cuadrado " + lado;
    }
}
