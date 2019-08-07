package entity;

import fight.AbstractAttacker;
import fight.Attackable;

public class Warrior extends AbstractAttacker {
    public Warrior(){}

    public Warrior(String name, int health) {
        super(name, health);
    }

    public int attack(Attackable attackable, String command) {
        if (command.equals("A") || command.equals("a") || command.equals("А") || command.equals("а")) {
            return super.attack(attackable, command);
        } else {
            return 0;
        }
    }
}

