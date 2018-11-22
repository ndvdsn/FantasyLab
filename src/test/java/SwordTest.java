import Fighters.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {
    Sword sword;

    @Before
    public void setUp() throws Exception {
        sword = new Sword(50);
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(50, sword.getAttackValue());
    }
}
