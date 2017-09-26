package lab2.prob1;

import java.time.Duration;

public class Feature {

  private Developer developer;
  private Duration effort;
  /**
   * remaining needs to smaller or equals to effort duration
   */
  private Duration remaining;

  public Duration getEffort() {
    return effort;
  }

  public Duration getRemaining() {
    return remaining;
  }
}
