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

    public void attack(Warrior warrior) {
        if(this.health > 0) {
            Random rnd = new Random(System.currentTimeMillis());
            int min = 10;
            int max = 30;
            int damage = min + rnd.nextInt(max - min + 1);
            if(warrior.getHealth() <= damage){
                damage = warrior.getHealth();}
            warrior.setHealth(warrior.getHealth() - damage);
            System.out.println(this.name + " нанес " + warrior.getName() + " " + damage + " урона, жизни осталось " + warrior.getHealth());
        }else
            System.out.println(warrior.getName() + " победил. "+ this.name + " погиб в бою");

    }
}