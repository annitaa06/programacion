package tema4.hero;

public class MainHero {
    public static void main(String[] args) {
        //creamos los heroes con valores
    Hero hero1= new Hero("galleta", 1,100,20,10);
    Hero hero2 = new  Hero("cereal",1,80,15,12);

    //mostramos info de los heroes
        System.out.println(hero1);
        System.out.println();
        System.out.println(hero2);
        System.out.println();

        //hero 1 ataca hero2
        System.out.println("GALLETA ataca a CEREAL ");
        hero1.attack(hero2);

        //mostramos info despues de atacar
        System.out.println("DESPUES DEL ATAQUE");
        System.out.println(hero1);
        System.out.println(hero2);

        //hero2 bebe pocion y despues descansa
        System.out.println("CEREAL bebe pocion y descansa");
        hero2.drinkPotion();
        hero2.rest();

        // mostrar info final
        System.out.println("\nEstado final:");
        System.out.println(hero1);
        System.out.println(hero2);
    }
}
