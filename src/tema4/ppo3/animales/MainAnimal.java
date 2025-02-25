package ppo3.animales;

public class MainAnimal {
    public static void main(String[] args) {
        // crear los animales
        Perro perro = new Perro("Choco");
        Gato gato = new Gato("Greta");
        Pajaro pajaro = new Pajaro("Piolín");
        Serpiente serpiente = new Serpiente("Kaa");
        Caballo caballo = new Caballo("Spirit");

        // probar los métodos comunes
        perro.comer();
        gato.dormir();
        pajaro.hacerRuido();

        System.out.println();

        // probar los métodos únicos
        perro.moverCola();
        gato.aranar();
        pajaro.volar();
        serpiente.mudarPiel();
        caballo.galopar();
    }
}
