package quiz6;

public class MyNumbers {

  private int first;
  private int second;
  private Compute computer;

  public MyNumbers(int first, int second) {
    this.first = first;
    this.second = second;
  }

  public int add(int x) {
    return Compute.add(first, second);
  }

  public int subtract() {
    computer = new Compute() {
    };
    return computer.operation(first, second);
  }

  public int multiply() {
    computer = new Multiply();
    return computer.operation(first, second);
  }

  public int divide() {
    computer = new Divide();
    return computer.operation(first, second);
  }
}
