package ru.skypro;

public class Slizeren extends Hogwarts{
    private int cunning;
    private int determination;
    private int resourcefulness;

    public Slizeren(int powerMage, int distanceMage,String name, int cunning, int determination, int resourcefulness) {
        super(powerMage, distanceMage,name);
        this.cunning = cunning;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    @Override
    public String toString() {
        return "Slizeren{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", resourcefulness=" + resourcefulness +
                '}'+ this.getPowerMage() + this.getDistanceMage();
    }
}
