package day2;
import java.util.Scanner;

// 1. Реализовать программу, которая принимает на вход через консоль с помощью
//класса Scanner, число, соответствующее количеству этажей в здании. Используя
//условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.
//Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более
//- “Многоэтажный дом”. Так же, необходимо учесть что может быть введено
//отрицательное значение, в таком случае сообщить “Ошибка ввода”.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of floors in the building: ");
        int numberOfFloors = scanner.nextInt();
        if (numberOfFloors >= 1 && numberOfFloors <= 4) {
            System.out.println("Low-rise house");
        } else if (numberOfFloors >= 5 && numberOfFloors <= 8) {
            System.out.println("Mid-rise house");
        } else if (numberOfFloors >= 9) {
            System.out.println("Multi-storey house");
        } else {
            System.out.println("Input Error");
        }
    }
}
