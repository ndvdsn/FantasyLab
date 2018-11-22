package Fighters;

import Fighters.Weapons.Weapon;


public class Dwarf extends Fighter {


    public Dwarf(String name, int healthValue, Weapon weapon) {
        super(name, healthValue, weapon);
    }

    public void takeDamage(int damage) {
        this.setHealthValue(getHealthValue()- damage / 2);
    }


}
