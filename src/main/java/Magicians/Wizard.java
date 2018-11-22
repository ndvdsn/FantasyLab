package Magicians;

import Fighters.Dwarf;
import Interfaces.IDamage;
import Magicians.Mythicals.Mythical;
import Magicians.Spells.Spell;

public class Wizard extends Magician {

    public Wizard(String name, int healthValue, Mythical mythical, Spell spell) {
        super(name, healthValue, mythical, spell);
    }

    public void takeDamage(int damage) {
        int value = this.getMythical().getShieldValue();
        if(damage > value) {
            this.setHealthValue(getHealthValue() - damage + this.getMythical().getShieldValue());
            this.getMythical().setShieldValue(0);
        } else {
            this.getMythical().setShieldValue(this.getMythical().getShieldValue() - damage);
        }

//                if damage is > value of dragon defense then
//                take the damage from the wizard.
//        if not then don't.'
    }

    public void attack(IDamage iDamage) {
        iDamage.takeDamage(this.getSpell().getSpellValue());

    }


}
