package fight;

import java.util.Random;

public class Monster {
    private String name;
    private int health;

    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int attack(Warrior warrior) {
        int damage = 0;
        if (this.health > 0) {
            Random rnd = new Random(System.currentTimeMillis());
            int min = 10;
            int max = 30;
            damage = min + rnd.nextInt(max - min + 1);
            if (warrior.getHealth() <= damage) {
                damage = warrior.getHealth();
            }
            warrior.setHealth(warrior.getHealth() - damage);
        } return damage;
    }
}