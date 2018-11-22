package Fighters;

import Fighters.Weapons.Weapon;

public class Barbarian extends Fighter{


    public Barbarian(String name, int healthValue, Weapon weapon) {
        super(name, healthValue, weapon);
    }

    public void takeDamage(int damage) {
        this.setHealthValue(getHealthValue()- damage);
    }
}
