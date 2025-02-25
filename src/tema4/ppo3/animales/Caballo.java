package ppo3.animales;
public class Caballo extends Animal {
    public Caballo(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " relincha: ¡Hiiiiii!");
    }

    public void galopar() {
        System.out.println(getNombre() + " está galopando.");
    }
}
