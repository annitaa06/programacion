package ppo3.animales;

public class Pajaro extends Animal {
    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " canta: ¡Pío pío!");
    }

    public void volar() {
        System.out.println(getNombre() + " está volando.");
    }
}
