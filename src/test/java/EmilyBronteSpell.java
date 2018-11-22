import Magicians.Spells.EmilyBronte;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmilyBronteSpell {

    EmilyBronte emilyBronte;

    @Before
    public void setUp() throws Exception {
        emilyBronte = new EmilyBronte(900);
    }

    @Test
    public void canGetSpellValue() {
        assertEquals(900, emilyBronte.getSpellValue());
    }


}
