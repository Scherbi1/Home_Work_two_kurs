package ru.skypro;

public class Puffendyi extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffendyi(int powerMage, int distanceMage, String name, int industriousness, int loyalty, int honesty) {
        super(powerMage, distanceMage,name);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return " Я студент Puffendyi{" +
                " мои характеристики industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}'+ this.getPowerMage() + this.getDistanceMage();
    }
}
