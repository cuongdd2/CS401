package lab2.prob2A;

public class Main {

  public static void main(String[] args) {
    Student student = new Student("Duc Cuong Do");
    System.out.println(student.getName());
    GradeReport report = new GradeReport();
    System.out.println(report.getStudentName());
  }
}
