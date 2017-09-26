package lab9.prob8;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
        new Employee("John", "Sims", 110000),
        new Employee("Joe", "Stevens", 200000),
        new Employee("Andrew", "Reardon", 80000),
        new Employee("Joe", "Cummings", 760000),
        new Employee("Steven", "Walters", 135000),
        new Employee("Thomas", "Blake", 111000),
        new Employee("Alice", "Richards", 101000),
        new Employee("Donald", "Trump", 100000));

    //print the number of Employees in list whose salary > 100000 and whose last name begins
    //with a letter that comes after the letter 'E'
    System.out.println(list.stream()
        .filter(employee -> employee.salary > 100000)
        .filter(employee -> employee.lastName.matches("[F-Z].*"))
        .count());
    //print a list of sorted full names - all upper case -- of Employees with
    //salary > 85000 and whose first name begins with a letter that comes before  the letter 'R'
    list.stream()
        .filter(employee -> employee.salary > 85000)
        .filter(employee -> employee.lastName.matches("[A-Q].*"))
        .map(employee -> employee.firstName + " " + employee.lastName)
        .map(String::toUpperCase)
        .sorted().forEach(System.out::println);
  }

}
