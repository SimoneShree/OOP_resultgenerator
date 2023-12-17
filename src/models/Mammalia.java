package models;

public class Mammalia {
    int numberheartchamber = 4;

    boolean Warmblooded = true;

    String eats = "food";

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNumberheartchamber() {
        return numberheartchamber;
    }

    public void setNumberheartchamber(int numberheartchamber) {
        this.numberheartchamber = numberheartchamber;
    }

    public boolean isWarmblooded() {
        return Warmblooded;
    }

    public void setWarmblooded(boolean warmblooded) {
        Warmblooded = warmblooded;


    }
}
