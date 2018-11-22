package Players;

public abstract class Player {
    private String name;
    private int healthValue;

    public Player(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }
}
