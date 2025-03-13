package Tuan8.Shapes;

public class Triangle extends TwoDimensional{
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculateArea() {
        return (0.5 * a) * b;
    }


    @Override
    public String toString() {
        return "Triangle : " +
                "Height = " + a +
                " | Base = " + b ;
    }
}
