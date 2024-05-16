package day5;

//1. Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
//Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
//задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
//Созданный вами класс должен отвечать принципам инкапсуляции.

public class Task1 {
    public static void main(String[] args) {
        Car cadillac = new Car();
        cadillac.setYearOfManufacture(1975);
        cadillac.setColour("White");
        cadillac.setCarModel("Eldorado");

        System.out.println("Year: " + cadillac.getYearOfManufacture());
        System.out.println("Colour: " + cadillac.getCarColour());
        System.out.println("Model: " + cadillac.getCarModel());
    }
}
