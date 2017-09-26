package lab4.prob4C;

public class Hourly extends Employee {

  private static int WeekPerMonth = 4;

  private double hourlyWage;
  private double hoursPerWeek;

  @Override
  public double calcGrossPay(int month, int year) {
    return WeekPerMonth * hoursPerWeek * hourlyWage;
  }
}
