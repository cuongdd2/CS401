package lab2.prob1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sprint {

  private Date dueDate;
  private List<Feature> features = new ArrayList<>();

  public Duration completedWork() {
    return Duration.ofHours(0);
  }

  public Duration remainingWork() {
    return Duration.ofHours(0);
  }
}
