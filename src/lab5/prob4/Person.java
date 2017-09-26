package lab5.prob4;

final public class Person {

  private String name;
  private BirthInfo birthInfo;

  Person(String name) {
    this.name = name;
  }

  public BirthInfo getBirthInfo() {
    return birthInfo;
  }

  void setBirthInfo(BirthInfo birthInfo) {
    this.birthInfo = birthInfo;
  }

  public String getName() {
    return name;
  }
}
