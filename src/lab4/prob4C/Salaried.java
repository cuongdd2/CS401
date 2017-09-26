package lab4.prob4C;

public class Salaried extends Employee {

  private double salary;

  @Override
  public double calcGrossPay(int month, int year) {
    return salary;
  }
}
