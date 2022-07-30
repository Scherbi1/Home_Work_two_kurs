package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Grifindor harryPotter = new Grifindor(7, 5, "Гарри Поттер", 5, 6, 7);
        Grifindor germiona = new Grifindor(5, 6, "Гермиона Грейнджер", 5, 6, 3);
        Grifindor ronYizli = new Grifindor(6, 4, "Рон Уизли", 4, 6, 9);
        Puffendyi zahariya = new Puffendyi(3, 3, " Захария Смит", 4, 5, 3);
        Puffendyi sedric = new Puffendyi(4, 5, " Седрик Диггори", 4, 5, 3);
        Puffendyi Djastin = new Puffendyi(6, 6, "Джастин Финч-Флетчли", 3, 4, 2);
        Kogtevran chang = new Kogtevran(4, 2, "Чжоу Чанг", 3, 5, 6);
        Kogtevran padma = new Kogtevran(4, 2, "Чжоу Чанг", 3, 5, 6);
        Kogtevran markus = new Kogtevran(4, 3, "Маркус Белби", 5, 2, 5);
        Slizeren drago = new Slizeren(6, 5, "Драко Малфой", 5, 7, 7);
        Slizeren Grehem = new Slizeren(4, 6, "Грэхэм Монтегю", 5, 3, 3);
        Slizeren Gregorii = new Slizeren(4, 2, "Грегори Гойл", 2, 6, 2);
          Grifindor.battleStudent( germiona,  ronYizli);
        Hogwarts.battleStudentHogwarts(harryPotter, drago);
    }
}
