package day3;

//Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
//делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
//и выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо
//того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
//выводим в консоль сообщение “Деление на 0”.
//Ключевое слово else использовать в этой программе нельзя.
//Пример:
//4 2 - ваш ввод в консоль
//2.0 - ответ программы
//100 0 - ваш ввод в консоль
//Деление на 0 - ответ программы
//13 10 - ваш ввод в консоль
//1.3 - ответ программы
//и так далее… (еще 2 итерации)

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dividend;
        double divider;
        int i = 1;

        while (true) {
            if(i == 5) {
                break;
            }

            System.out.print("Enter two numbers: ");
            dividend = scanner.nextDouble();
            divider = scanner.nextDouble();

            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(dividend / divider);
            i++;
        }
    }
}
