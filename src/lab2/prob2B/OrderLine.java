package lab2.prob2B;

public class OrderLine {

  private Order order;

  public OrderLine() {
    this.order = new Order(0, this);
  }

  public OrderLine(Order order) {
    this.order = order;
  }

  public int getOrderNum() {
    return this.order.getOrderNum();
  }
}
