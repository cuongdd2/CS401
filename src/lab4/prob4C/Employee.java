package lab4.prob4C;

public abstract class Employee {

  private int empId;

  public void print() {
    System.out.println("Employee: " + empId);
  }

  public Paycheck calcCompensation(int month, int year) {
    double gross = calcGrossPay(month, year);
    Paycheck paycheck = new Paycheck(gross);

    return paycheck;
  }

  abstract public double calcGrossPay(int month, int year);
}
