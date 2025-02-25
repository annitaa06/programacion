package ppo3.interfaces.ataques;

public class Ataquemagico implements IAtaque{
    private int danioafligido = 15, coste = 17;
    @Override
    public void lanzar() {
        System.out.println("LANZA UN ATAQUE MAGICO");
    }

    @Override
    public void coste() {
        System.out.println("EL COSTE DEL ATAQUE MAGICO ES: " + coste);
    }

    @Override
    public void danioafligido() {
        System.out.println("EL DAÑO DEL ATAQUE  MAGICO  ES: " + danioafligido);
    }

}
