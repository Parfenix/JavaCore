package day2;
import java.util.Scanner;

//Реализовать программу, которая принимает на вход через консоль с помощью класса
//Scanner, число x. Для этого числа, по формуле, необходимо вычислить
//значение y

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        double x = scanner.nextDouble();
        double y;

        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
            System.out.println("y = (" + x + "^2 -10) / (" + x + " + 7) = " + y);
        } else if (x > -3 && x < 5) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
            System.out.println("y = (" + x + " + 3) * (" + x + "^2 - 2) = " + y);
        } else {
            y = 420;
            System.out.println("y = " + y);
        }
    }
}
