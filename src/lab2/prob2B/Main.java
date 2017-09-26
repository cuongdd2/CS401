package lab2.prob2B;

public class Main {

  public static void main(String[] args) {
    Order order = new Order(100);
    System.out.println(order.getOrderNum());
    OrderLine orderLine = new OrderLine();
    System.out.println(orderLine.getOrderNum());
  }
}
