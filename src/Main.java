import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) System.out.println("Поздравляю с совершеннолетием");
        else System.out.println("Возраст совершеннолетия еще не наступил");
        //Задача 2
        int ageSecond = sc.nextInt();
        if((ageSecond >=7) && (ageSecond < 18)) System.out.println("Ребенок ходит в школу");
        if((ageSecond>=18)&&(ageSecond<24)) System.out.println("человек уже закончил школу и может отправляться в университет");
        if(ageSecond>=24) System.out.println("Человек окончил университет и ему пора искать первую работу");
        //Задача 3
        int total = 102;
        int seats = 60;
        int other = total - seats;
        int seatsUsed = 5;
        int otherUsed = 9;
        if(seatsUsed+otherUsed > total) System.out.println("Вагон полностью забит");
        else {
            if (seatsUsed < seats) System.out.println("Сидячих мест осталось " + (seats - seatsUsed));
            if (otherUsed < other) System.out.println("Стоячих мест осталось " + (other - otherUsed));
        }

    }
}