package day9;

public class Triangle extends Figure{

    private float side1Length;
    private float side2Length;
    private float side3Length;

    public Triangle(float side1Length, float side2Length, float side3Length, String color) {
        super(color);
        this.side1Length = side1Length;
        this.side2Length = side2Length;
        this.side3Length = side3Length;
    }

    @Override
    public double area() {

        float semiPerimeter = (side1Length + side2Length + side3Length) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - side1Length) * (semiPerimeter - side2Length) * (semiPerimeter - side3Length));
    }

    @Override
    public double perimeter() {
        return side1Length + side2Length + side3Length;
    }
}
