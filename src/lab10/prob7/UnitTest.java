package lab10.prob7;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UnitTest {

  @Test
  public void testAsString() {
    List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
        new Employee("John", "Sims", 110000),
        new Employee("Joe", "Stevens", 200000),
        new Employee("Andrew", "Reardon", 80000),
        new Employee("Joe", "Cummings", 760000),
        new Employee("Steven", "Walters", 135000),
        new Employee("Thomas", "Blake", 111000),
        new Employee("Alice", "Richards", 101000),
        new Employee("Donald", "Trump", 100000));

    assertEquals("Alice Richards, Joe Stevens, John Sims, Steven Walters", Main.asString(emps));
  }

  @Test
  public void testSalary() {
    Employee emp = new Employee("Alice", "Richards", 101000);
    assertTrue(Main.salaryGreaterThan100000(emp));
  }

  @Test
  public void testName() {
    Employee emp = new Employee("Alice", "Richards", 101000);
    assertTrue(Main.lastNameAfterM(emp));
  }

  @Test
  public void testFullname() {
    Employee emp = new Employee("Alice", "Richards", 101000);
    assertEquals("Alice Richards", Main.fullName(emp));
  }
}
