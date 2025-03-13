package Tuan8.Shapes;

public abstract  class ThreeDimensional extends Shapes {
   public abstract double getArea();
    public abstract double getVolume();

    public String getType(){
        return "ThreeDimensional";
    }

}
