package Tuan2;

public class CalculatePerimeterAndArea {
    double result;
    public CalculatePerimeterAndArea() {

    }

    public double CalculatePerimeter(double a, double b) {
        result = 2 * (a + b);
        return result;
    }
    public double CalculateArea(double a, double b) {
        result = a * b;
        return result;
    }

    public double CalculateRadiusArea(double r) {
        result = r * Math.PI * r;
        return result;
    }

    public double CalculateRadiusPerimeter(double r) {
        result = Math.PI * r * 2;
        return result;
    }

    public double CalculateTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }

    public double CalculateTrianglePerimeter(double a, double b, double c) {
        result = a + b + c;
        return result;
    }
}
