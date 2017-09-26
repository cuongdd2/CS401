package lab3.prob3B;

public class Circle {

  private double radius = 1.0;
  private String color = "red";

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public String toString() {
    return "Circle " + color + " with radius " + radius;
  }
}
