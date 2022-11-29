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

        if (age >= 2 && age <= 6)
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        else if (age >= 7  && age <= 18)
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        else if (age >= 19 && age <= 23)
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        else System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");

        if (age < 5)
            System.out.println("Нельзя кататься!");
        else if (age < 14)
            System.out.println("Можно кататься в сопровождении взрослого");
        else System.out.println("Можно кататься");

        int one = 1;
        int two = 2;
        int three = 1;
        int max = one;
        if (two > max){
            if (three > max)
            max = three;
            else max = two;}
        System.out.println(max);
    }
}