package ppo3.interfaces.ataques;

public class Ataquefisymag implements IAtaque{
    private int danioafligido = 54, coste = 55;

    @Override
    public void lanzar() {
        System.out.println("LANZA UN ATAQUE FISICO Y MAGICO");
    }

    @Override
    public void coste() {
        System.out.println("EL COSTE DEL ATAQUE FISICO Y MAGICO ES: " + coste);
    }

    @Override
    public void danioafligido() {
        System.out.println("EL DAÑO DEL ATAQUE FISICO Y MAGICO ES: " + danioafligido);
    }


}
