package prob1;

import java.util.Objects;

public class CD extends LendingItem {

  private String productId;
  private String title;
  private String company;

  public CD(String productId, String title, String company) {
    this.productId = productId;
    this.title = title;
    this.company = company;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof CD)) {
      return false;
    }
    CD cd = (CD) obj;
    return Objects.equals(productId, cd.productId) && Objects.equals(title, cd.title)
        && Objects.equals(company, cd.company);
  }
}
