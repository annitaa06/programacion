package ppo3.interfaces.ataques;

public class Ataquefisico implements IAtaque{

    private int coste = 2, danioafligido = 30;

    @Override
    public void lanzar() {
        System.out.println("LANZA UN ATAQUE FISICO");
    }

    @Override
    public void coste() {
        System.out.println("EL COSTE DEL ATAQUE FISICO ES: " + coste);
    }

    @Override
    public void danioafligido() {
        System.out.println("EL DAÑO DEL ATAQUE FISICO ES: " + danioafligido);
    }


}

