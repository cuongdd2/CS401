package lab2.prob2A;

public class GradeReport {

  private Student student;

  public GradeReport() {
    this.student = new Student("New Graduatable", this);
  }

  public GradeReport(Student student) {
    this.student = student;
    this.student.setReport(this);
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public String getStudentName() {
    return this.student.getName();
  }
}
