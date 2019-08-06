package entity;

import fight.AbstractAttacker;
import fight.Attackable;

public class Monster extends AbstractAttacker {
    public Monster(){}

    public Monster(String name, int health) {
        super(name, health);
    }

    public int attack(Attackable attackable, String command) {
        return super.attack(attackable, command);
    }
}
