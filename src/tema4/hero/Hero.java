package tema4.hero;

public class Hero {
    //atributos
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;
    private int estaVivo;


    //constructor
    public Hero(String name, int level, int maxHealth, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.health = maxHealth; //ponemos la salud al principio como max
        this.experience = 0;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
    }


    //metodos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    //metodos

    public void drinkPotion() {
        this.health = Math.min(this.health + 10, this.maxHealth); // suma 10 a la salud, sin superar la máxima
    }

    public void rest() {
        this.health = Math.min(this.health + 50, this.maxHealth); // suma 50 a la salud, sin superar la máxima
    }

    public void attack(Hero enemy) {
        // calcular el daño: mínimo 10 o (ataque - defensa)
        int damage = Math.max(this.attack - enemy.defense, 10);
        enemy.health -= damage;
        if (enemy.health < 0) {
            enemy.health = 0; // no puede tener salud negativa
        }

        // Gana experiencia
        this.experience += 10;

        // Subir nivel si alcanza 50 de experiencia
        if (this.experience >= 50) {
            this.levelUp();
        }
    }
    public boolean estaVivo(){
        return this.health > 0;
    }

    private void levelUp() {
        this.level++;
        this.health += 5; // Subir salud
        this.attack++; // Subir ataque
        this.defense++; // Subir defensa
        this.experience = 0; // Restablecer la experiencia
    }
    public String toString() {
        return "Hero: " + name + "\n" +
                "Level: " + level + "\n" +
                "Health: " + health + "/" + maxHealth + "\n" +
                "Attack: " + attack + "\n" +
                "Defense: " + defense + "\n" +
                "Experience: " + experience;
    }

}