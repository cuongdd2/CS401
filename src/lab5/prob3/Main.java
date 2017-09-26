package lab5.prob3;

public class Main {

  public static void main(String[] args) {
    Shape[] shapes = {
        new Circle(rnd()),
        new Rectangle(rnd(), rnd()),
        new Triangle(rnd(), rnd()),
        new Rectangle(rnd(), rnd()),
        new Circle(rnd()),
        new Circle(rnd()),
        new Triangle(rnd(), rnd())
    };

    double sum = 0;

    for (Shape s : shapes) {
      sum += s.getArea();
    }

    System.out.println("Sum of Areas = " + Math.round(sum * 100) / 100.0);
  }

  private static double rnd() {
    return Math.random() * 3 + 2;
  }
}
