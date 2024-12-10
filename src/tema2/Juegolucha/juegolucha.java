package tema2.Juegolucha;

import java.util.Random;
import java.util.Scanner;

public class juegolucha {
    public static void main(String[] args) {

        int velpers1 = 0, ataqpers1 = 0, defpers1 = 1, vidpers1 = 0;
        int velpers2 = 0, ataqpers2 = 0, defpers2 = 0, vidpers2 = 0;
        int suma1, suma2;
        int controndas = 1;
        boolean contbatalla= true;
        int input;

        System.out.println("\n" +
                "  ____  _                           _     _       \n" +
                " |  _ \\(_)                         (_)   | |      \n" +
                " | |_) |_  ___ _ ____   _____ _ __  _  __| | ___  \n" +
                " |  _ <| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\ \n" +
                " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) |\n" +
                " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/ \n"
        );

        Scanner sc = new Scanner(System.in);

        // Solicitar atributos para el personaje 1
        suma1 = 0;
        while (suma1 > 500 || suma1 == 0) {
            System.out.println("Personaje 1: Ingresa tus atributos (cada uno entre 1 y 200, no deben superar un total de 500):");

            System.out.print("Velocidad: ");
            velpers1 = sc.nextInt();
            while (velpers1 < 1 || velpers1 > 200) {
                System.out.println("La velocidad debe estar entre 1 y 200.");
                System.out.print("Velocidad: ");
                velpers1 = sc.nextInt();
            }

            System.out.print("Ataque: ");
            ataqpers1 = sc.nextInt();
            while (ataqpers1 < 1 || ataqpers1 > 200) {
                System.out.println("El ataque debe estar entre 1 y 200.");
                System.out.print("Ataque: ");
                ataqpers1 = sc.nextInt();
            }

            System.out.print("Vida: ");
            vidpers1 = sc.nextInt();
            while (vidpers1 < 1 || vidpers1 > 200) {
                System.out.println("La vida debe estar entre 1 y 200.");
                System.out.print("Vida: ");
                vidpers1 = sc.nextInt();
            }

            System.out.print("Defensa: ");
            defpers1 = sc.nextInt();
            while (defpers1 < 1 || defpers1 > 200) {
                System.out.println("La defensa debe estar entre 1 y 200.");
                System.out.print("Defensa: ");
                defpers1 = sc.nextInt();
            }

            suma1 = velpers1 + ataqpers1 + vidpers1 + defpers1;
            if (suma1 > 500) {
                System.out.println("Los valores del personaje 1 suman más de 500. Por favor, vuelve a introducir los valores.");
            } else {
                System.out.println("Los valores de jugador 1 son correctos.");
            }
        }

        // Solicitar atributos para el personaje 2
        suma2 = 0;
        while (suma2 > 500 || suma2 == 0) {
            System.out.println("Personaje 2: Ingresa tus atributos (cada uno entre 1 y 200, no deben superar un total de 500):");

            System.out.print("Velocidad: ");
            velpers2 = sc.nextInt();
            while (velpers2 < 1 || velpers2 > 200) {
                System.out.println("La velocidad debe estar entre 1 y 200.");
                System.out.print("Velocidad: ");
                velpers2 = sc.nextInt();
            }

            System.out.print("Ataque: ");
            ataqpers2 = sc.nextInt();
            while (ataqpers2 < 1 || ataqpers2 > 200) {
                System.out.println("El ataque debe estar entre 1 y 200.");
                System.out.print("Ataque: ");
                ataqpers2 = sc.nextInt();
            }

            System.out.print("Vida: ");
            vidpers2 = sc.nextInt();
            while (vidpers2 < 1 || vidpers2 > 200) {
                System.out.println("La vida debe estar entre 1 y 200.");
                System.out.print("Vida: ");
                vidpers2 = sc.nextInt();
            }

            System.out.print("Defensa: ");
            defpers2 = sc.nextInt();
            while (defpers2 < 1 || defpers2 > 200) {
                System.out.println("La defensa debe estar entre 1 y 200.");
                System.out.print("Defensa: ");
                defpers2 = sc.nextInt();
            }

            suma2 = velpers2 + ataqpers2 + vidpers2 + defpers2;
            if (suma2 > 500) {
                System.out.println("Los valores del personaje 2 suman más de 500. Por favor, vuelve a introducir los valores.");
            } else {
                System.out.println("Los valores de jugador 2 son correctos.");
            }
        }
        System.out.println("\n" +
                "  ______                 _                 _         _            _           _ _ \n" +
                " |  ____|               (_)               | |       | |          | |         | | |\n" +
                " | |__   _ __ ___  _ __  _  ___ ______ _  | | __ _  | |_   _  ___| |__   __ _| | |\n" +
                " |  __| | '_ ` _ \\| '_ \\| |/ _ \\_  / _` | | |/ _` | | | | | |/ __| '_ \\ / _` | | |\n" +
                " | |____| | | | | | |_) | |  __// / (_| | | | (_| | | | |_| | (__| | | | (_| |_|_|\n" +
                " |______|_| |_| |_| .__/|_|\\___/___\\__,_| |_|\\__,_| |_|\\__,_|\\___|_| |_|\\__,_(_|_)\n" +
                "                  | |                                                             \n" +
                "                  |_|                                                             \n");
        Random random = new Random();
        boolean turnoJugador1 = velpers1 >= velpers2;

        while (vidpers1 > 0 && vidpers2 > 0) {
            if (turnoJugador1) {
                System.out.println("Jugador 1: para atacar, pulsa 1, para omitir el ataque y pasar turno pulsa otro numero");
                input = sc.nextInt();
                //si pulsa 1 ataca
                if (input == 1) {
                    //formula de daño
                    int danoPersonaje1 = (int) Math.max(0, (ataqpers1 / 2.0 - defpers2 / 3.0) * (0.3 + random.nextDouble()));

                    //se resta la vida del personaje 2 al daño que le hace el personaje 1
                    vidpers2 -= danoPersonaje1;
                    // si vida pers2 es menor a 0 vida persona igual 0
                    if (vidpers2 < 0) vidpers2 = 0;
                    //muesta los valores
                    System.out.println("Jugador 1 ataca y hace " + danoPersonaje1 + " de daño a Jugador 2.");
                    System.out.println("Vida restante de Jugador 2: " + vidpers2);
                    if (vidpers2>0) {
                        for (int i = 0; i < vidpers2; i = i + 2) {
                            System.out.print("♥ ");
                        }
                        System.out.println();
                    }
                }
            } else {
                System.out.println("Jugador 2: para atacar, pulsa 1  para omitir el ataque y pasar turno pulsa otro numero");
                 input = sc.nextInt();
                if (input == 1) {
                    //formula daño jugador 2
                    int danoPersonaje2 = (int) Math.max(0, (ataqpers2 / 2.0 - defpers1 / 3.0) * (0.3 + random.nextDouble()));

                    //se resta la vida del personaje 1 al daño que le ha hecho el jugador 2
                    vidpers1 -= danoPersonaje2;
                    if (vidpers1 < 0) vidpers1 = 0;
                    System.out.println("Jugador 2 ataca y hace " + danoPersonaje2 + " de daño a Jugador 1.");
                    System.out.println("Vida restante de Jugador 1: " + vidpers1);
                    if (vidpers1 > 0) {
                        for (int i = 0; i < vidpers1; i = i + 2) {
                            System.out.print("♥ ");
                        }
                        System.out.println();
                    }
                }
            }
            turnoJugador1 = !turnoJugador1;
        }
        if (velpers1<velpers2){
            System.out.println("Jugador 2: para atacar, pulsa 1  para omitir el ataque y pasar turno pulsa otro numero");
            input = sc.nextInt();
            if (input == 1) {
                //formula daño jugador 2
                int danoPersonaje2 = (int) Math.max(0, (ataqpers2 / 2.0 - defpers1 / 3.0) * (0.3 + random.nextDouble()));

                //se resta la vida del personaje 1 al daño que le ha hecho el jugador 2
                vidpers1 -= danoPersonaje2;
                if (vidpers1 < 0) vidpers1 = 0;
                System.out.println("Jugador 2 ataca y hace " + danoPersonaje2 + " de daño a Jugador 1.");
                System.out.println("Vida restante de Jugador 1: " + vidpers1);
                if (vidpers1 > 0) {
                    for (int i = 0; i < vidpers1; i = i + 2) {
                        System.out.print("♥ ");
                    }
                    System.out.println();
                }
            }
        }else if (velpers2>velpers1){
            System.out.println("Jugador 1: para atacar, pulsa 1, para omitir el ataque y pasar turno pulsa otro numero");
            input = sc.nextInt();
            //si pulsa 1 ataca
            if (input == 1) {
                //formula de daño
                int danoPersonaje1 = (int) Math.max(0, (ataqpers1 / 2.0 - defpers2 / 3.0) * (0.3 + random.nextDouble()));

                //se resta la vida del personaje 2 al daño que le hace el personaje 1
                vidpers2 -= danoPersonaje1;
                // si vida pers2 es menor a 0 vida persona igual 0
                if (vidpers2 < 0) vidpers2 = 0;
                //muesta los valores
                System.out.println("Jugador 1 ataca y hace " + danoPersonaje1 + " de daño a Jugador 2.");
                System.out.println("Vida restante de Jugador 2: " + vidpers2);
                if (vidpers2>0) {
                    for (int i = 0; i < vidpers2; i = i + 2) {
                        System.out.print("♥ ");
                    }
                    System.out.println();
                }
            }
        }





        if (vidpers1 <= 0) {
            System.out.println();
            System.out.println("┓┏             ┓    •       ┓      ┏┓\n" +
                    "┣┫┏┓  ┏┓┏┓┏┓┏┓┏┫┏┓  ┓┓┏┏┓┏┓┏┫┏┓┏┓  ┏┛\n" +
                    "┛┗┗┻  ┗┫┗┻┛┗┗┻┗┻┗┛  ┃┗┻┗┫┗┻┗┻┗┛┛   ┗━\n" +
                    "       ┛            ┛   ┛            \n" +
                    "\n");
        } else if (vidpers2 <= 0){
            System.out.println();
            System.out.println("┓┏             ┓    •       ┓      ┓  \n" +
                    "┣┫┏┓  ┏┓┏┓┏┓┏┓┏┫┏┓  ┓┓┏┏┓┏┓┏┫┏┓┏┓  ┃  \n" +
                    "┛┗┗┻  ┗┫┗┻┛┗┗┻┗┻┗┛  ┃┗┻┗┫┗┻┗┻┗┛┛   ┻  \n" +
                    "       ┛            ┛   ┛             \n" +
                    "\n");
        }

    }
}