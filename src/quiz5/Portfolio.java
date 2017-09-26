package quiz5;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

  private List<Project> projects = new ArrayList<>();


  public void addProject(Project p) {
    projects.add(p);
  }

  public List<Project> getProjects() {
    return projects;
  }
}
