package Magicians.Mythicals;

public abstract class Mythical {

    private int shieldValue;

    public Mythical(int shieldValue) {
        this.shieldValue = shieldValue;
    }

    public int getShieldValue() {
        return shieldValue;
    }

    public void setShieldValue(int shieldValue) {
        this.shieldValue = shieldValue;
    }


}
