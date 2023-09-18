public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
    }
    public static void task1() {
        byte age = 20;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен %d, то он совершеннолетний", age);
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        byte temperature = -10;
        if (temperature < 5) {
            System.out.printf("На улице %d градусов, нужно надеть шапку", temperature);
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3() {
        byte speed = 70;
        if (speed > 60) {
            System.out.printf("Если скорость %d, то придется заплатить штраф", speed);
        } else {
            System.out.println("Можно ездить спокойно");
        }
    }
    public static void task4() {
        byte age = 18;
        if (age >= 2 && age <= 6) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад", age);
        } else if (age >= 7 && age <= 17) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу", age);
        } else if (age >= 18 && age <= 24){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет", age);
        } else {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работу", age);
        }
    }
    public static void task5(){
        byte ageChild = 8;
        if (ageChild < 5){
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе",ageChild);
        } else if (ageChild > 5 && ageChild < 14){
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе в сопровождении",ageChild);
        } else {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься без сопровождения взрослого",ageChild);
        }
    }
    public static void task6(){
        byte trainCarriage = 102;
        byte seatPlace = 60;
        byte passengers = 65;
        if (passengers < seatPlace){
            System.out.println("Есть свободные места");
        } else if (passengers < trainCarriage){
            System.out.println("Сидящих мест нету, остались стоячие");
        } else {
            System.out.println("Свободных мест нету");
        }
    }
    public static void task7(){
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.printf("%d наибольшее число",one);
        } else if (two > one && two > three){
            System.out.printf("%d наибольшее число", two);
        } else {
            System.out.printf("%d наибольшее число", three);
        }
    }
}

