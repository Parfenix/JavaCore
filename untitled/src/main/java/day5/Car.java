package day5;

public class Car {
    private int yearOfManufacture;
    private String carColour;
    private String carModel;

    public void setYearOfManufacture(int year) {
        yearOfManufacture = year;
    }

    public void setColour(String colour) {
        carColour = colour;
    }

    public void setCarModel(String model) {
        carModel = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getCarColour() {
        return carColour;
    }

    public String getCarModel() {
        return carModel;
    }
}
