package ru.skypro;

public  abstract class Hogwarts {
    private  String name;
    private int powerMage;
    private int distanceMage;

    public Hogwarts(int powerMage, int distanceMage, String name ) {
        this.powerMage = powerMage;
        this.distanceMage = distanceMage;
        this.name=name;
    }
    public static void battleStudentHogwarts(Hogwarts oneStudent, Hogwarts twoStudent) {
        int sumOneStudent = oneStudent.powerMage + oneStudent.distanceMage;
        int sumTwoStudent = twoStudent.powerMage + twoStudent.distanceMage;
        if (sumOneStudent > sumTwoStudent) {
            System.out.println(oneStudent.getName() + " является более сильным студентом школы Хогвартс, чем " + twoStudent.getName());
        } else if (sumOneStudent < sumTwoStudent) {
            System.out.println(twoStudent.getName() + " является более сильным студентом школы Хогвартс, чем " + oneStudent.getName());
        } else {
            System.out.println("Одинаковые");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerMage() {
        return powerMage;
    }

    public void setPowerMage(int powerMage) {
        this.powerMage = powerMage;
    }

    public int getDistanceMage() {
        return distanceMage;
    }

    public void setDistanceMage(int distanceMage) {
        this.distanceMage = distanceMage;
    }
}
