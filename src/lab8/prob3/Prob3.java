package lab8.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Prob3 {

  public static void main(String[] args) {
    System.out.println(toList.apply(2.0, 3.0));
  }

  static BiFunction<Double, Double, List<Double>> toList = (Double x, Double y) -> {
    List<Double> list = new ArrayList<>();
    list.add(Math.pow(x, y));
    list.add(x * y);
    return list;
  };
}
