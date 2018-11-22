package Fighters;
import Players.Player;

import java.util.ArrayList;

public abstract class Fighter extends Player {

    private ArrayList<IWeapon> weapons;

    public Fighter(String name, int healthValue) {
        super(name, healthValue);
        this.weapons = new ArrayList<IWeapon>();
    }


}
