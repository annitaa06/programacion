package ppo3.animales;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " maúlla: ¡Miau miau!");
    }

    public void aranar() {
        System.out.println(getNombre() + " está arañando el sofá.");
    }
}
