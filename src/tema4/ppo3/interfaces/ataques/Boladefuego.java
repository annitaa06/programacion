package ppo3.interfaces.ataques;


    public class Boladefuego implements IAtaqueavanzado{
        private int usomana = 100, usofisico = 0, danio = 100;

        @Override
        public void lanzar() {
            System.out.println("SE LANZA LA BOLA DE FUEGO");
        }
        public void coste(){ System.out.println("EL COSTE DE LA BOLA DE FUEGO ES: " + usofisico + "DE USO FISICO Y " + usomana + "DE USO DE MANA" );
        }

        @Override
        public void danioafligido() {
            System.out.println("EL DAÑO QUE HACE LA BOLA DE FUEGO ES: " + danio);
        }


    }

