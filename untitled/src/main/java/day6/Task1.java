package day6;

//В классах Автомобиль и Мотоцикл реализовать два метода:
//info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//yearDifference() - принимает на вход число (год), и возвращает разницу между
//переданным годом и годом выпуска транспортного средства

public class Task1 {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.setYearOfManufacture(2020);
        tesla.info();
        System.out.println("Year difference: " + tesla.yearDifference(2024));


        Motorbike ducati = new Motorbike(2018, "black", "panigale");
        ducati.info();
        System.out.println("Year difference: " + tesla.yearDifference(2024));
    }
}
