package lab4.prob4C;

import java.util.Date;

public class Order {

  private int orderNo;
  private Date orderDate;
  private double orderAmount;

  public double getSalesByDate(int month, int year) {
    if (orderDate.getMonth() == month && orderDate.getYear() == year) {
      return orderNo * orderAmount;
    } else {
      return 0;
    }
  }
}
