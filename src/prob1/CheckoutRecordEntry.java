package prob1;

import java.time.LocalDate;

public class CheckoutRecordEntry {

  private LocalDate checkoutDate;
  private LocalDate dueDate;
  private LendingItem lendingItem;
  private ItemType itemType;

  public CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type) {
    this.checkoutDate = chDate;
    this.dueDate = dueDate;
    this.lendingItem = item;
    this.itemType = type;
  }

  public LocalDate getCheckoutDate() {
    return checkoutDate;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public ItemType getLendingItemType() {
    return itemType;
  }

  public LendingItem getLendingItem() {
    return lendingItem;
  }


}
