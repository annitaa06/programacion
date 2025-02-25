package ppo3.animales;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " ladra: ¡Guau guau!");
    }

    public void moverCola() {
        System.out.println(getNombre() + " está moviendo la cola.");
    }
}
