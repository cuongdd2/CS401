package lab5.prob4;

final public class PersonWithBirthInfo {

  private Person person;
  private BirthInfo birthInfo;

  PersonWithBirthInfo(Person p, BirthInfo bi) {
    person = p;
    birthInfo = bi;
  }

  public Person getPerson() {
    return person;
  }

  public BirthInfo getBirthInfo() {
    return birthInfo;
  }
}
