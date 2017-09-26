package lab11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Prob1 {

  public static void main(String[] args) {
    List<? extends Number> numbers = new ArrayList<>();
    addHelper(numbers, 12);
    addHelper(numbers, 1.23);
    addHelper(numbers, 21);
    addHelper(numbers, 20.99999);
    System.out.println(secondSmallest(numbers));
  }

  private static <T> void addHelper(List<T> numbers, Number integer) {
    numbers.add((T) integer);
  }

  private static <T> void addHelper(List<T> col, T t) {
    col.add(t);
  }

  private static double secondSmallest(Collection<? extends Number> numbers) {
    double smallest = Double.MAX_VALUE;
    double second = Double.MAX_VALUE;

    for (Number n : numbers) {
      if (n.doubleValue() < smallest) {
        second = smallest;
        smallest = n.doubleValue();
      } else if (n.doubleValue() < second) {
        second = n.doubleValue();
      }
    }

    return second;
  }
}
