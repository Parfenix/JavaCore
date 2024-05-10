package day2;
import java.util.Scanner;

// Реализовать программу №2, используя цикл while.

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Invalid input");
            return;
        }

        System.out.print("Output: ");

        while (a <= b) {
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");
            }

            a++;
        }
    }
}
