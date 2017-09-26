package lab3.prob2;

public class Main {

  public static void main(String[] args) {
    Landlord landlord = new Landlord();
    int bldgNum = (int) (Math.random() * 5) + 1;
    for (int i = 0; i < bldgNum; i++) {
      Building building = new Building();
      int aptNum = (int) (Math.random() * 10) + 1;
      for (int j = 0; j < aptNum; j++) {
        Apartment apartment = new Apartment();
        apartment.setRentalFee(Math.round(Math.random() * 1000 + 100));
        building.addApartment(apartment);
      }
      landlord.addBuilding(building);
    }
    System.out.println("Total profit: " + landlord.calculateIncome());
  }
}
