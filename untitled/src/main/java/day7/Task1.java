package day7;

// 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
//дня.
//В классе Самолет создать статический метод compareAirplanes, который в
//качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
//сообщение в консоль о том, какой из самолетов длиннее.

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 2020, 35, 13000);
        Airplane airplane2 = new Airplane("Boeing", 2017, 40, 16000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
