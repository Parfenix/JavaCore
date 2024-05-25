package day8;

//2. Скопируйте класс Самолет из задания дня 6.
//Внесите изменения в класс таким образом, чтобы следующий код выводил
//информацию о самолете, аналогично вызову метода info().
//Airplane airplane = new Airplane ("Boeing", 2000, 150, 10000);
//System.out.println(airplane);

//Producer: Boeing, year of manufacture: 2000, length: 150, weight: 10000, amount of fuel in the tank: 0

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000, 150, 10000);
        System.out.println(airplane);
    }
}
