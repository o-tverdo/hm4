import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age = 15;
        System.out.println("Человеку " + age + "лет");
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte degreeOutside = 6;
        if (degreeOutside <= 5) {
            System.out.println("На улице " + degreeOutside + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + degreeOutside + " градусов, можно идти без шапки.");
        }


    }

    public static void task3() {
        System.out.println("Задача 3");
        short carSpeed = 50;
        if (carSpeed > 60) {
            System.out.println("Скорость привышена");
        } else {
            System.out.println("Если скорость " + carSpeed + " ,то можно ездить спокойно");
        }
        if (carSpeed < 60) {
            System.out.println("Привышения скорости нет");
        } else {
            System.out.println("Если скорость " + carSpeed + " ,то  придется заплатить штраф");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        byte age = 7;
        boolean litlleAge = age >= 2 && age <= 6;
        boolean middleAge = age >= 7 && age <= 18;
        boolean bigAge = age >= 18 && age <= 24;
        if (litlleAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в сад");
        } else if (middleAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (bigAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte age = 7;
        boolean adult = false;
        boolean baby = age < 5;
        boolean kid = age >= 5 && age < 14;
        boolean teenager = age >= 14 && age < 18;

        if (baby) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (kid && adult == true) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (kid && adult != true) {
            System.out.println("Если возраст ребенка равен " + age + " и взрослого нет, кататься нельзя") ;
        } else if (teenager) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("Если возраст равен " + age + ", это не ребёнок.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte capacityOfOneWagon = 102;
        byte wagonHasSittingPlace = 60;
        int wagonHasStandingPlace = capacityOfOneWagon - wagonHasSittingPlace;
        byte sittingPlace = 65;
        byte standingPlace = 0;
        boolean haveAllPlace = sittingPlace < wagonHasSittingPlace && standingPlace < wagonHasStandingPlace;
        boolean onlyStandingPlace = sittingPlace >= wagonHasSittingPlace && standingPlace < wagonHasStandingPlace;
        if (haveAllPlace) {
            System.out.println("В вагоне есть и сидячие и стоячие места");
        } else if (onlyStandingPlace) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 523;
        int two = 445;
        int three = 444;
        boolean oneBigger = (one > two && one > three);
        boolean twoBigger = (two > one && two > three);
        if (oneBigger) {
            System.out.println("Самое большее число " + one);} else if (twoBigger) {
            System.out.println("Самое большое число " + two);} else {
            System.out.println("Самое большее число " + three);}
    }
}









