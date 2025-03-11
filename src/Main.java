public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний.\n\nЗадача 2");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, то он не достиг совершеннолетия, нужно немного подождать.\n\nЗадача 2");
        }
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.\n\nЗадача 3");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.\n\nЗадача 3");
        }
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.\n\nЗадача 4");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.\n\nЗадача 4");
        }
        int yearsOld = 35;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + " лет, то ему нужно ходить в детский сад.\n\nЗадача 5");
        } if (yearsOld >= 7 && yearsOld <= 17) {
            System.out.println("Если возраст человека равен " + yearsOld + " лет, то ему нужно ходить в школу.\n\nЗадача 5");
        } if (yearsOld >= 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + " лет, то его место в университете.\n\nЗадача 5");
        } if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + " лет, то ему пора ходить на работу.\n\nЗадача 5");
        }
        int childAge = 7;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " лет, то ему нельзя кататься на аттракционе\n\nЗадача 6");
        } if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " лет, то ему можно кататься на аттракционе в сопровождении взрослого\n\nЗадача 6");
        } if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " лет, то он может кататься без сопровождения взрослого.\n\nЗадача 6");
        }
        int number = 103;
        int standUp = 102;
        int seat = 60;
        if (number >= 1 && number <= seat) {
            System.out.println("Под номером " + number + " есть сидячее место.\n\nЗадача 7");
        } else if (number > seat && number <= standUp) {
            System.out.println("Под номером " + number + " есть стоячее место.\n\nЗадача 7");
        } else {
            System.out.println("В вагоне нет такого места. Поезд полностью забит.\n\nЗадача 7");
        }
        int one = 111;
        int two = 22;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше всех.");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше всех.");
        } else {
            System.out.println("Число " + three + " больше всех.");
        }
    }
}