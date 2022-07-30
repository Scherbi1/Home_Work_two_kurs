package ru.skypro;

import org.w3c.dom.ls.LSOutput;

public class Grifindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Grifindor(int powerMage, int distanceMage, String name, int nobility, int honour, int bravery) {
        super(powerMage, distanceMage, name);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public static void battleStudent(Grifindor oneStudent, Grifindor twoStudent) {
        int sumOneStudent = oneStudent.bravery + oneStudent.honour + oneStudent.nobility;
        int sumTwoStudent = twoStudent.bravery + twoStudent.honour + twoStudent.nobility;
        if (sumOneStudent > sumTwoStudent) {
            System.out.println(oneStudent.getName() + " более сильным студентом факультета Грифиндор, чем является" + twoStudent.getName());
        } else if (sumOneStudent < sumTwoStudent) {
            System.out.println(twoStudent.getName() + " более сильным студентом является факультета Грифиндор, Чем " + oneStudent.getName());
        } else {
            System.out.println("Одинаковые");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
   // @Override
   public String toString() {
        return " Я учусь в Grifindor{" +
                " мои характеристика: nobility=" + nobility +
                ", honour=" + honour +
                ", bravery=" + bravery +
                '}' + this.getPowerMage()  + " " + this.getDistanceMage();
    }
}
