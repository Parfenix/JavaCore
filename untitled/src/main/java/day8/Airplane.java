package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Producer: " + producer + ", year of manufacture: " + year + ", length: " + length + ", weight: " + weight + ", amount of fuel in the tank: " + getFuel());
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Airplane{" +
                "Producer: '" + producer + '\'' +
                ", year of manufacture: "+ year +
                ", length: " + length +
                ", weight: " + weight +
                ", amount of fuel in the tank: " + fuel +
                '}';
    }
}
