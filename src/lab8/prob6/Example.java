package lab8.prob6;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Example {

  Function<String, String> toUpper1 = (String x) -> x.toUpperCase();
  Function<String, String> toUpper2 = String::toUpperCase;
  Function<Employee, String> getName = (Employee e) -> e.getName();
  BiConsumer<Employee, String> setName = (Employee e, String s) -> e.setName(s);
  BiFunction<String, String, Integer> comapre = (String s1, String s2) -> s1.compareTo(s2);
  BiFunction<Integer, Integer, Double> pow = (Integer x, Integer y) -> Math.pow(x, y);
  Function<Apple, Double> getWeight = (Apple a) -> a.getWeight();
  Function<String, Integer> parseInt = (String x) -> Integer.parseInt(x);
  EmployeeNameComparator comp = new EmployeeNameComparator();
  BiFunction<Employee, Employee, Integer> compare = (Employee e1, Employee e2) -> comp
      .compare(e1, e2);

  void evaluator() {
    System.out.println(toUpper2.apply("heelo"));
    Employee e = new Employee();
    Employee e2 = new Employee();
    e.setName("Mr. A");
    System.out.println(getName.apply(e));
    setName.accept(e, "Mr. B");
    System.out.println(pow.apply(2, 3));
    System.out.println(comapre.apply("s1", "s2"));
    System.out.println(getWeight.apply(new Apple(2.13)));
    System.out.println(parseInt.apply("123"));
    System.out.println(compare.apply(e, e2));
  }
}

class Apple {

  private double weight;

  public double getWeight() {
    return weight;
  }

  public Apple(double w) {
    weight = w;
  }
}

class Employee {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class EmployeeNameComparator {

  public int compare(Employee e1, Employee e2) {
    return 0;
  }
}