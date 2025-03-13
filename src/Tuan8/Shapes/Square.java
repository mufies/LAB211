package Tuan8.Shapes;

public class Square extends TwoDimensional{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square : " +
                "Side = " + side;
    }
}
