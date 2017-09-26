package prob2;

public class Admin {

  //implement
  private final Department[] departments;

  public Admin(Department[] depts) {
    departments = depts;
  }

  public String hourlyCompanyMessage() {
    StringBuilder rs = new StringBuilder();
    for (Department d : departments) {
      try {
        rs.append(format(d.getName(), d.nextMessage()));
      } catch (EmptyQueueException e) {

      }
    }
    return rs.toString();
  }

  public String format(String name, String msg) {
    return name + ": " + msg + "\n";
  }
}
