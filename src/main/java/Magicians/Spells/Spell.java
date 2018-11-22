package Magicians.Spells;

public abstract class Spell {

    private int spellValue;

    public Spell(int spellValue) {
        this.spellValue = spellValue;
    }

    public int getSpellValue() {
        return spellValue;
    }


}
