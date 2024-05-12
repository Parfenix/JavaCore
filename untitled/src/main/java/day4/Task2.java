package day4;

//2. Создать новый массив размера 100 и заполнить его случайными числами из
//диапазона от 0 до 10000.
//Затем, используя циклы for each вывести:
//- наибольший элемент массива
//- наименьший элемент массива
//- количество элементов массива, оканчивающихся на 0
//- сумму элементов массива, оканчивающихся на 0
//Использовать сортировку запрещено.

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] myArray = new int[100];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10000);
        }

        int max = myArray[0];
        int min = myArray[0];
        int count = 0;
        int sum = 0;

        for (int item : myArray) {

            if (item > max) {
                max = item;
            }

            if (item < min) {
                min = item;
            }

            if (Integer.toString(item).endsWith("0")) {
                count++;
                sum += item;
            }
        }

        System.out.println(Arrays.toString(myArray));
        System.out.println("The largest array element: " + max);
        System.out.println("The smallest element of the array: " + min);
        System.out.println("Number of array elements ending in 0: " + count);
        System.out.println("The sum of array elements ending in 0: " + sum);

    }
}
