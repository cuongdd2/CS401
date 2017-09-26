package lab5.prob3;

public class Rectangle implements Shape {

  private double width;
  private double height;

  public Rectangle(double w, double h) {
    width = w;
    height = h;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  @Override
  public double getArea() {
    return width * height;
  }
}
