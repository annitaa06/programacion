package ppo3.interfaces.ataques;

    public class Ataqueespadazoencantado implements IAtaqueavanzado{
        private int usomana = 100, usofisico = 100, danio = 300;

        @Override
        public void lanzar() {
            System.out.println("SE LANZA LEL ESPADAZO ENCANTADO");
        }
        public void coste(){ System.out.println("EL COSTE DEL ESPADAZO ENCANTADO ES: " + usofisico + "DE USO FISICO Y " + usomana + "DE USO DE MANA" );
        }

        @Override
        public void danioafligido() {
            System.out.println("EL DAÑO QUE HACE EL ESPADAZO ENCANTADO ES: " + danio);
        }

    }

