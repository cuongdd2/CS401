package quiz5;

public abstract class Student implements Graduatable {

  protected static int COURSES_TO_GRADUATE;

  private int courseCredits;

  public Student(int credit) {
    this.courseCredits = credit;
  }

  public int getCourseCredits() {
    return courseCredits;
  }

}
