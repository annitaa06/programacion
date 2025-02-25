package ppo3.animales;


public class Serpiente extends Animal {
    public Serpiente(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " sisea: ¡Sssss!");
    }

    public void mudarPiel() {
        System.out.println(getNombre() + " está mudando su piel.");
    }
}
