package tema4.hero;

import java.util.Random;

public class JuegoRol {
    public static void main(String[] args) {
        // Creamos al jugador con atributos iniciales
        Hero jugador = new Hero("Jugador", 1, 100, 20, 5);
        Random random = new Random();
        int hordas = 0;
        boolean seguirJugando = true;

        while (seguirJugando) {
            hordas++;
            System.out.println("\n¡Horda " + hordas + " aparece!");

            // Se generan entre 1 y 3 enemigos
            int numEnemigos = random.nextInt(3) + 1;
            Hero Esqueleto = new Hero("Esqueleto", 1, 50, 10, 2);
            Hero Creeper = new Hero("Creeper", 1, 50, 30, 2);
            Hero Zombie = new Hero("Zombie", 1, 50, 20, 4);

            // Si hay menos de 2 enemigos, el segundo no participa
            if (numEnemigos < 2) {
                Creeper.setHealth(0);
            }
            // Si hay menos de 3 enemigos, el tercero no participa
            if (numEnemigos < 3) {
                Zombie.setHealth(0);
            }

            // Bucle de pelea mientras haya enemigos vivos y el jugador siga con vida
            boolean enemigosVivos = true;
            while (enemigosVivos && jugador.getHealth() > 0) {
                System.out.println("▗▄▄▄▖▗▖ ▗▖▗▄▄▖ ▗▖  ▗▖ ▗▄▖     ▗▄▄▄  ▗▄▄▄▖    ▗▄▄▖ ▗▄▄▄▖▗▖   ▗▄▄▄▖ ▗▄▖ \n" +
                        "  █  ▐▌ ▐▌▐▌ ▐▌▐▛▚▖▐▌▐▌ ▐▌    ▐▌  █ ▐▌       ▐▌ ▐▌▐▌   ▐▌   ▐▌   ▐▌ ▐▌\n" +
                        "  █  ▐▌ ▐▌▐▛▀▚▖▐▌ ▝▜▌▐▌ ▐▌    ▐▌  █ ▐▛▀▀▘    ▐▛▀▘ ▐▛▀▀▘▐▌   ▐▛▀▀▘▐▛▀▜▌\n" +
                        "  █  ▝▚▄▞▘▐▌ ▐▌▐▌  ▐▌▝▚▄▞▘    ▐▙▄▄▀ ▐▙▄▄▖    ▐▌   ▐▙▄▄▖▐▙▄▄▖▐▙▄▄▖▐▌ ▐▌\n" );

                System.out.println(jugador);

                // Probabilidad de huida (10%) antes de cada ataque
                if (Esqueleto.getHealth() > 0 && random.nextInt(10) == 0) {
                    System.out.println(Esqueleto.getName() + " ha huido!");
                    Esqueleto.setHealth(0);
                }
                if (Creeper.getHealth() > 0 && random.nextInt(10) == 0) {
                    System.out.println(Creeper.getName() + " ha huido!");
                    Creeper.setHealth(0);
                }
                if (Zombie.getHealth() > 0 && random.nextInt(10) == 0) {
                    System.out.println(Zombie.getName() + " ha huido!");
                    Zombie.setHealth(0);
                }

                //Turno de ataque del jugador
                if (Esqueleto.getHealth() > 0) {
                    jugador.attack(Esqueleto);
                    System.out.println(jugador.getName() + " ATACA A  " + Esqueleto.getName() + "!");
                    System.out.println(Esqueleto);
                }
                if (Creeper.getHealth() > 0) {
                    jugador.attack(Creeper);
                    System.out.println(jugador.getName() + " ATACA A " + Creeper.getName() + "!");
                    System.out.println(Creeper);
                }
                if (Zombie.getHealth() > 0) {
                    jugador.attack(Zombie);
                    System.out.println(jugador.getName() + " ATACA A " + Zombie.getName() + "!");
                    System.out.println(Zombie);
                }

                // Turno de ataque de los enemigos
                if (Esqueleto.getHealth() > 0) {
                    Esqueleto.attack(jugador);
                    System.out.println(Esqueleto.getName() + " ATACA A " + jugador.getName() + "!");
                    System.out.println(jugador);
                }
                if (Creeper.getHealth() > 0) {
                    Creeper.attack(jugador);
                    System.out.println(Creeper.getName() + " ATACA A " + jugador.getName() + "!");
                    System.out.println(jugador);
                }
                if (Zombie.getHealth() > 0) {
                    Zombie.attack(jugador);
                    System.out.println(Zombie.getName() + " ATACA A " + jugador.getName() + "!");
                    System.out.println(jugador);
                }

                // Verificamos si aún quedan enemigos con vida
                enemigosVivos = Esqueleto.getHealth() > 0 || Creeper.getHealth() > 0 || Zombie.getHealth() > 0;

                // Probabilidad de descansar (0.1%)
                if (random.nextInt(1000) == 0) {
                    jugador.rest();
                    System.out.println(jugador.getName() + " descansa y recupera salud.");
                }

                // Probabilidad de encontrar una poción (10%)
                if (random.nextInt(10) == 0) {
                    jugador.drinkPotion();
                    System.out.println(jugador.getName() + " encuentra una poción y recupera salud.");
                }
            }

            // Si el jugador muere, termina el juego
            if (jugador.getHealth() <= 0) {
                seguirJugando = false;
            }
        }

        System.out.println("\nEl juego ha terminado. Sobreviviste a " + hordas + " hordas.");
    }
}
