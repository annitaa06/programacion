package ppo3.figura;

public class Triangulo extends Figura2D {
    private double base;
    private double altura;
    private double lado1, lado2, lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2;
    }

    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    public String toString() {
        return "Triángulo de base " + base + ", altura " + altura + " y lados " + lado1 + ", " + lado2 + ", " + lado3;
    }
}
