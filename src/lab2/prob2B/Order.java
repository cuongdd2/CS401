package lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {

  private int orderNum;
  private List<OrderLine> orderLines = new ArrayList<>();

  public Order(int orderNum) {
    this.orderNum = orderNum;
    this.orderLines.add(new OrderLine(this));
  }

  public Order(int orderNum, OrderLine orderLine) {
    this.orderNum = orderNum;
    this.orderLines.add(orderLine);
  }

  public void addOrderLine(OrderLine orderLine) {
    orderLines.add(orderLine);
  }

  public int getOrderNum() {
    return orderNum;
  }
}
