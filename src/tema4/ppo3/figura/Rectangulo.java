package ppo3.figura;

public class Rectangulo extends Figura2D {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.altura=altura;
        this.base= base;

    }

    public void setbase(double base) {
        this.base= base;

    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    public double getaltura() {
        return altura;
    }

    public double getbase() {
        return base;
    }
    public double area() {
        return altura * base;
    }

    public double perimetro() {
        return 2 * (altura + base);
    }


    public String toString() {
        return "rectangulo de base "+ base + " y altura " + altura;
    }
}


