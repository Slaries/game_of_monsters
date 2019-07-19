package fight;

import java.util.Random;

public abstract class AbstractAttacker implements Attackable {

    /*
    * TODO:
    *  1. Добавить отступы между методами и полями. Неудобно читать.
    *  2. Добавить конструктор по умолчанию (пустой).
    *  3. Исправить аргумент метода attack!
    *  4. Метод должен реализовывать метод интерфейса. Внимательнее с этим.
    *  5. ты пытаешься обращаться к getHealth() по имени класса.
    *     Очевидно, это неправильно, это же нестатический метод.
    *
    * */
     private String name;
     private int health;
    public AbstractAttacker(String name, int health) {
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

    public int attack(AbstractAttacker) {
        int damage = 0;
        if (this.health > 0) {
            Random rnd = new Random(System.currentTimeMillis());
            int min = 10;
            int max = 30;
            damage = min + rnd.nextInt(max - min + 1);
            if (AbstractAttacker.getHealth() <= damage) {
                damage = AbstractAttacker.getHealth();
            }
            AbstractAttacker.setHealth(AbstractAttacker.getHealth() - damage);
        } return damage;
    }

}
