package lab4.prob4C;

import java.util.List;

public class Commissioned extends Employee {

  private double commission;
  private double baseSalary;
  private List<Order> orders;

  @Override
  public double calcGrossPay(int month, int year) {
    double totalSales = 0;
    for (Order order : orders) {
      totalSales += order.getSalesByDate(month, year);
    }
    return baseSalary + commission * totalSales;
  }
}
