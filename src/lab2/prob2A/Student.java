package lab2.prob2A;

public class Student {

  private String name;
  private GradeReport report;

  public Student(String name) {
    this.name = name;
    this.report = new GradeReport(this);
  }

  public Student(String name, GradeReport report) {
    this.name = name;
    this.report = report;
    this.report.setStudent(this);
  }

  public void setReport(GradeReport report) {
    this.report = report;
  }

  public String getName() {
    return name;
  }
}
