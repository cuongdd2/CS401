package lab5.prob4;

import java.time.LocalDate;

final public class Factory {

  private Factory() {
  }

  public static PersonWithBirthInfo createPersonWithBirthInfo(String name, LocalDate dob) {
    Person p = new Person(name);
    BirthInfo birthInfo = new BirthInfo(dob);
    p.setBirthInfo(birthInfo);
    return new PersonWithBirthInfo(p, birthInfo);
  }
}
