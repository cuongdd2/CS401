package lab3.prob3B;

public class Cylinder {

  private double height = 1.0;
  private Circle circle = new Circle();

  public Cylinder() {
  }

  public Cylinder(double radius) {
    circle = new Circle(radius);
  }

  public Cylinder(double radius, double height) {
    this(radius);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public double getVolume() {
    return height * circle.getArea();
  }
}
