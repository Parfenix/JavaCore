package day6;

public class Motorbike {
    private int yearOfManufacture;
    private String colour;
    private String model;

    public Motorbike(int year, String colour, String model) {
        yearOfManufacture = year;
        this.colour = colour;
        this.model = model;
    }

    public void getInfoAbout() {
        System.out.println("Year: " + yearOfManufacture);
        System.out.println("Colour: " + colour);
        System.out.println("Model: " + model);

    }

    public void info() {
        System.out.println("This is a motorbike");
    }

    public int yearDifference(int year) {
        return year - yearOfManufacture;
    }


}
