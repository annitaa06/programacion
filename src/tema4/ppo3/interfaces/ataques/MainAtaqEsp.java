package ppo3.interfaces.ataques;

public class MainAtaqEsp {
    public static void main(String[] args) {
        Boladefuego bola = new Boladefuego();
        Ataqueespadazo espadazo = new Ataqueespadazo();
        Ataqueespadazoencantado espadazoen = new Ataqueespadazoencantado();

        System.out.println("BOLA DE FUEGO");
        bola.coste();
        bola.danioafligido();
        bola.lanzar();
        System.out.println();

        System.out.println("ESPADAZO");
        espadazo.coste();
        espadazo.danioafligido();
        espadazo.lanzar();
        System.out.println();

        System.out.println("ESPADAZO ENCANTADO");
        espadazoen.coste();
        espadazoen.danioafligido();
        espadazoen.lanzar();
        System.out.println();
    }
}
