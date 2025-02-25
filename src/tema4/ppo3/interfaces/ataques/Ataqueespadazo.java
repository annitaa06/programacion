package ppo3.interfaces.ataques;

public class Ataqueespadazo implements IAtaqueavanzado {

        private int usomana = 0, usofisico = 90, danio = 120;

        @Override
        public void lanzar () {
            System.out.println("SE LANZA UN ESPADAZO");
        }
        public void coste () {
            System.out.println("EL COSTE DEL ESPADAZO ES: " + usofisico + "DE USO FISICO Y " + usomana + "DE USO DE MANA");
        }

        @Override
        public void danioafligido () {
            System.out.println("EL DAÑO QUE HACE EL ESPADAZO ES: " + danio);

        }
    }
