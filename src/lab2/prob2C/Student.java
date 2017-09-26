package lab2.prob2C;

import java.util.ArrayList;
import java.util.List;

public class Student {

  public String name;
  private List<Section> sections = new ArrayList<>();

  public Student(String name) {
    this.name = name;
    this.sections.add(new Section(0, this));
  }

  public Student(String name, Section section) {
    this.name = name;
    this.sections.add(section);
  }
}
