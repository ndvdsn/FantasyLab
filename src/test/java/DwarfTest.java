import Fighters.Dwarf;
import Fighters.Knight;
import Fighters.Weapons.Axe;
import Fighters.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Knight knight;
    Sword sword;
    Axe axe;

    @Before
    public void setUp() throws Exception {
        axe = new Axe(20);
        sword = new Sword(40);
        knight = new Knight("Lancelot", 100, sword, true);
        dwarf = new Dwarf("Dopey", 75, axe);
    }

    @Test
    public void fighterCanAttack() {

        dwarf.attack(knight);
        assertEquals(95, knight.getHealthValue());

    }

    @Test
    public void canBeAttacked() {
        knight.attack(dwarf);
        assertEquals(55, dwarf.getHealthValue());
    }
}
