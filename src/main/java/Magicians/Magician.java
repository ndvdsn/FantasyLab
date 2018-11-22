package Magicians;

import Magicians.Mythicals.Mythical;
import Magicians.Spells.EmilyBronte;
import Magicians.Spells.Spell;
import Players.Player;

public abstract class Magician extends Player {

    private Mythical mythical;
    private Spell spell;

    public Magician(String name, int healthValue, Mythical mythical, Spell spell) {
        super(name, healthValue);
        this.mythical = mythical;
        this.spell = spell;
    }

    public Mythical getMythical() {
        return mythical;
    }

    public void setMythical(Mythical mythical) {
        this.mythical = mythical;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
}
