package tema3;

public class ejer6 {
    public static void main(String[] args) {
        System.out.println("estas son las tablas de multiplicar");
        tablasmultiplicar();
    }
    public static void tablasmultiplicar() {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int u =1; u<=10;u++){
                System.out.println(i*u);
            }
        }
    }
}
