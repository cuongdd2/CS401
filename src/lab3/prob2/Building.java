package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {

  private double maintenanceCost;
  private List<Apartment> apartments = new ArrayList<>();

  public double getMaintenanceCost() {
    return maintenanceCost;
  }

  public void setMaintenanceCost(double maintenanceCost) {
    this.maintenanceCost = maintenanceCost;
  }

  public void addApartment(Apartment a) {
    apartments.add(a);
  }

  public double getProfit() {
    double rentalFees = 0;
    for (Apartment a : apartments) {
      rentalFees += a.getRentalFee();
    }
    return rentalFees - maintenanceCost;
  }
}
