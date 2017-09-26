package lab8.prob2.comparator2;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee e1, Employee e2) {
    int value = e1.name.compareTo(e2.name);
    return value == 0 ? e1.salary - e2.salary : value;
  }
}
