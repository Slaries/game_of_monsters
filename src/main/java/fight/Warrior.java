package fight;

import java.util.Random;

public class Warrior {
    private String name;
    private int health;

    public Warrior(String name, int health) {
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

    public int attack(Monster monster) {
        int damage = 0;
        if (this.health > 0) {
            Random rnd = new Random(System.currentTimeMillis());
            int min = 10;
            int max = 30;
            damage = min + rnd.nextInt(max - min + 1); // create damage
            if (monster.getHealth() <= damage) {
                damage = monster.getHealth();
            }
            monster.setHealth(monster.getHealth() - damage);
        }
        return damage;
    }
}
