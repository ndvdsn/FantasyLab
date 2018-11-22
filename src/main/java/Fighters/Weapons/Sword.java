package Fighters.Weapons;

import Interfaces.IDamage;
import Interfaces.IWeapon;

public class Sword implements IWeapon {

    private int attackValue;

    public Sword(int attackValue) {
        this.attackValue = attackValue;
    }

    public void attack(IDamage iDamage) {
        iDamage.takeDamage(this.getAttackValue());
    }

    public int getAttackValue() {
        return this.attackValue;
    }
}
