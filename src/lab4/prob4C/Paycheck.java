package lab4.prob4C;

public class Paycheck {

  private double grossPay;
  private double fica = 0.23;
  private double state = 0.05;
  private double local = 0.01;
  private double medicare = 0.03;
  private double socialSecurity = 0.075;

  public Paycheck(double grossPay) {
    this.grossPay = grossPay;
  }

  public void print() {
  }

  public double getNetPay() {
    return grossPay * (1 - fica - state - local - medicare - socialSecurity);
  }
}
