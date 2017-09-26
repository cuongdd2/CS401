package lab9.prob7b;

import java.util.List;

public class LambdaLibrary {

  public static final TriFunction<List<Employee>, Integer, String, String> RUN = (list, minSalary, regex) -> list
      .stream()
      .filter(employee -> employee.salary > minSalary)
      .filter(employee -> employee.lastName.matches(regex))
      .map(employee -> employee.firstName + " " + employee.lastName)
      .sorted()
      .reduce((s, s2) -> s + ", " + s2).get();
}
