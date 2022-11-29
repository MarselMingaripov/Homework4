public class Main {
    public static void main(String[] args) {

        int age = 18;
        if (age >= 18)
            System.out.println("Поздравляю с совершеннолетием!");
        else System.out.println("Вы еще не достигли совершеннолетия!");

        if(age >= 24)
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        else
        if (age >= 18)
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        else if (age >= 7)
            System.out.println("Ребенок ходит в школу");

        int totalCapasity = 102;
        int seatCapasity = 60;
        int countOfPassengers = 78;
        if (countOfPassengers > totalCapasity)
            System.out.println("Мест нет");
        else if (countOfPassengers > seatCapasity)
            System.out.println("Есть стоячие места");
        else System.out.println("Есть сидячие места");


    }
}