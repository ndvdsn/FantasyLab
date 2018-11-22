package Fighters;

import Fighters.Weapons.Weapon;


public class Knight extends Fighter {

    private boolean armour;


    public Knight(String name, int healthValue, Weapon weapon, boolean armour) {
        super(name, healthValue, weapon);
        this.armour = true;
    }



    public void takeDamage(int damage){
        if(damage > 100){
            this.armour = false;
            this.setHealthValue(getHealthValue() - damage);
        } else {
            this.setHealthValue(getHealthValue() - damage / 4 );
        }
    }
}
