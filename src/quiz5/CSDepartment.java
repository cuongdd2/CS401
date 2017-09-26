package quiz5;

public class CSDepartment {

  public static void main(String[] args) {
    Student[] students = {
        new Graduate(rnd(20), rnd(2)),
        new Graduate(rnd(100), rnd(1)),
        new Graduate(rnd(100), rnd(10)),
        new Undergrad(rnd(30), rnd(2)),
        new Undergrad(rnd(100), rnd(5)),
        new Undergrad(rnd(500), rnd(1))
    };

    for (Student s : students) {
      System.out.println(s.getClass().getSimpleName() + ": " + s.getCourseCredits() + " credits");
      s.checkGraduateStatus();
    }
  }

  private static int rnd(int i) {
    return (int) (Math.random() * i);
  }
}
