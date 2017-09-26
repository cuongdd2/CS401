package quiz5;

public class Graduate extends Student {

  private Research research = new Research();

  public Graduate(int credit, int publicationNo) {
    super(credit);
    COURSES_TO_GRADUATE = 22;
    for (int i = 0; i < publicationNo; i++) {
      research.addPublication(new Publication());
    }
  }

  @Override
  public void checkGraduateStatus() {
    if (getCourseCredits() < COURSES_TO_GRADUATE) {
      System.out.println("  not enough course credit");
    } else if (research.getPublications().isEmpty()) {
      System.out.println("  no publication found");
    } else {
      System.out.println("  graduated");
    }
  }
}
