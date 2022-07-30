package ru.skypro;

public class Kogtevran extends Hogwarts{
    private int mind;
    private int wit;
    private int creation;

    public Kogtevran(int powerMage, int distanceMage, String name, int mind, int wit, int creation) {
        super(powerMage, distanceMage,name);
        this.mind = mind;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "mind=" + mind +
                ", wit=" + wit +
                ", creation=" + creation +
                '}'+ this.getPowerMage() + this.getDistanceMage();
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}
