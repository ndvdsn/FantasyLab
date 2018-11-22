package Fighters;
import Fighters.Weapons.Weapon;
import Interfaces.IDamage;
import Interfaces.IWeapon;
import Players.Player;

import java.util.ArrayList;

public abstract class Fighter extends Player {

    private ArrayList<Weapon> weapons;
    private Weapon weapon;

    public Fighter(String name, int healthValue, Weapon weapon) {
        super(name, healthValue);
        this.weapons = new ArrayList<Weapon>();
        this.weapon = weapon;
    }


    public void attack(IDamage iDamage) {
        iDamage.takeDamage(this.weapon.getAttackValue());
    }
}
