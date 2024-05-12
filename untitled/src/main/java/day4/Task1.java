package day4;

//1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
//указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
//содержимое массива в консоль, а также вывести в консоль информацию о:
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива
//Пример:
//Введено число 10. Сгенерирован следующий массив:
//[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//Информация о массиве:
//Длина массива: 10
//Количество чисел больше 8: 1
//Количество чисел равных 1: 0
//Количество четных чисел: 6
//Количество нечетных чисел: 4
//Сумма всех элементов массива: 46

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for array size: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        int countGreaterNumbers = 0;
        int countEqualNumbers = 0;
        int countEvenNumbers = 0;
        int countOddNumbers = 0;
        int sum = 0;

        for (int number : array) {

            if (number > 8) {
                countGreaterNumbers++;
            } else if (number == 1) {
                countEqualNumbers++;
            }

            if (number % 2 == 0) {
                countEvenNumbers++;
            } else {
                countOddNumbers++;
            }

            sum += number;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Array information:");
        System.out.println("Array length: " + array.length);
        System.out.println("The number of numbers is greater than 8: " + countGreaterNumbers);
        System.out.println("The number of numbers equal to 1: " + countEqualNumbers);
        System.out.println("Number of even numbers: " + countEvenNumbers);
        System.out.println("Number of odd numbers: " + countOddNumbers);
        System.out.println("The sum of all array elements: " + sum);
    }
}
