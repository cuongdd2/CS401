package lab2.prob2C;

import java.util.ArrayList;
import java.util.List;

public class Section {

  public int sectionNum;
  private List<Student> students = new ArrayList<>();

  public Section(int sectionNum) {
    this.sectionNum = sectionNum;
  }

  public Section(int sectionNum, Student student) {
    this.sectionNum = sectionNum;
    this.students.add(student);
  }
}
