package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {

  private List<Building> buildings = new ArrayList<>();

  public void addBuilding(Building b) {
    buildings.add(b);
  }

  public double calculateIncome() {
    double totalIncome = 0;
    for (Building b : buildings) {
      totalIncome += b.getProfit();
    }
    return totalIncome;
  }
}
