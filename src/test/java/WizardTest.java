import Fighters.Dwarf;
import Fighters.Weapons.Club;
import Magicians.Mythicals.Dragon;
import Magicians.Spells.EmilyBronte;
import Magicians.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Dragon dragon;
    EmilyBronte emilyBronte;
    Dwarf dwarf;
    Club club;

    @Before
    public void setUp() throws Exception {
        dragon = new Dragon(70);
        club = new Club(60);
        dwarf = new Dwarf("Sleepy", 40, club);

        emilyBronte = new EmilyBronte(10);
        wizard = new Wizard("Svalbard", 80, dragon, emilyBronte);
    }

    @Test
    public void wizardCanAttackDwarf() {
        wizard.attack(dwarf);
        assertEquals(35, dwarf.getHealthValue());
    }

    @Test
    public void canGetMythicalCreature(){
        assertEquals(dragon, wizard.getMythical());
    }

    @Test
    public void wizardCanBeAttacked() {
        dwarf.attack(wizard);
        assertEquals(80, wizard.getHealthValue());
        assertEquals(10, dragon.getShieldValue());
    }
}
