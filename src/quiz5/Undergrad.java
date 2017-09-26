package quiz5;

public class Undergrad extends Student {

  private Portfolio portfolio = new Portfolio();

  public Undergrad(int credit, int projectNo) {
    super(credit);
    COURSES_TO_GRADUATE = 34;
    for (int i = 0; i < projectNo; i++) {
      portfolio.addProject(new Project());
    }
  }

  @Override
  public void checkGraduateStatus() {
    if (getCourseCredits() < COURSES_TO_GRADUATE) {
      System.out.println("  not enough course credit");
    } else if (portfolio.getProjects().isEmpty()) {
      System.out.println("  no project found");
    } else {
      System.out.println("  graduated");
    }
  }
}
