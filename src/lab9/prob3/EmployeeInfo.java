package lab9.prob3;

import java.util.*;
import java.util.function.Function;

public class EmployeeInfo {

  static enum SortMethod {BYNAME, BYSALARY}

  ;
  private Function<Employee, String> byName = Employee::getName;
  private Function<Employee, Integer> bySalary = e -> -e.getSalary();
  private HashMap<SortMethod, Pair> sortMethods = new HashMap<>();

  {
    sortMethods.put(SortMethod.BYNAME, new Pair(byName, bySalary));
    sortMethods.put(SortMethod.BYSALARY, new Pair(bySalary, byName));
  }

  public void sort(List<Employee> emps, final SortMethod method) {
    Collections.sort(emps, Comparator.comparing(sortMethods.get(method).first)
        .thenComparing(sortMethods.get(method).second));
  }

  class Pair {

    Function first;
    Function second;

    public Pair(Function first, Function second) {
      this.first = first;
      this.second = second;
    }
  }

  public static void main(String[] args) {
    List<Employee> emps = new ArrayList<>();
    emps.add(new Employee("Joe", 100000));
    emps.add(new Employee("Tim", 50000));
    emps.add(new Employee("Rick", 50000));
    emps.add(new Employee("Andy", 60000));
    emps.add(new Employee("Tim", 10000));
    EmployeeInfo ei = new EmployeeInfo();
    ei.sort(emps, SortMethod.BYNAME);
    System.out.println(emps);
    //same instance
    ei.sort(emps, SortMethod.BYSALARY);
    System.out.println(emps);
  }
}
