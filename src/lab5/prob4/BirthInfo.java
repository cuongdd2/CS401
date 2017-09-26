package lab5.prob4;

import java.time.LocalDate;

final public class BirthInfo {

  private LocalDate dateOfBirth;

  BirthInfo(LocalDate dob) {
    dateOfBirth = dob;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }
}
