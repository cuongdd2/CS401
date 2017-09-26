package quiz6;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

  public static void main(String[] args) {
    MyNumbers numbers = new MyNumbers(4, 2);
    List<Integer> list = Arrays.asList(1, 1);
//        System.out.println(operate(numbers, MyNumbers::add));
    System.out.println(operate(numbers, MyNumbers::subtract));
    System.out.println(operate(numbers, MyNumbers::multiply));
    System.out.println(operate(numbers, MyNumbers::divide));

    BiFunction<MyNumbers, Integer, Integer> function = MyNumbers::add;
    Function<Integer, Integer> func2 = numbers::add;
    function.apply(numbers, 1);
  }

  private static int operate(MyNumbers numbers, Function<MyNumbers, Integer> f) {
    return f.apply(numbers);
  }
}
