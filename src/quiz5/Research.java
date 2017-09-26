package quiz5;

import java.util.ArrayList;
import java.util.List;

public class Research {

  private List<Publication> publications = new ArrayList<>();


  public List<Publication> getPublications() {
    return publications;
  }

  public void addPublication(Publication p) {
    this.publications.add(p);
  }
}
