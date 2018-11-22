package Fighters.Weapons;

import Interfaces.IDamage;

public abstract class Weapon {
    private int attackValue;

    public Weapon(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }




}
