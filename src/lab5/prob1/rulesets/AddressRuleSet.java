package lab5.prob1.rulesets;

import java.awt.Component;

import lab5.prob1.windows.AddrWindow;

final public class AddressRuleSet implements RuleSet {

  //package level access
  AddressRuleSet() {
  }

  @Override
  public void applyRules(Component ob) throws RuleException {
    AddrWindow addr = (AddrWindow) ob;

    emptyRule(addr);
    idRule(addr);
    zipRule(addr);
    stateRule(addr);
    equalRule(addr);
  }

  private void emptyRule(AddrWindow addr) throws RuleException {
    if (isEmpty(addr.getCityValue()) || isEmpty(addr.getIdValue())
        || isEmpty(addr.getStateValue()) || isEmpty(addr.getStreetValue()) || isEmpty(
        addr.getZipValue())) {
      throw new RuleException("All fields must be nonempty");
    }
  }

  private boolean isEmpty(String s) {
    return s == null || s.length() == 0;
  }

  private void idRule(AddrWindow addr) throws RuleException {
    try {
      Integer.parseInt(addr.getIdValue());
    } catch (NumberFormatException e) {
      throw new RuleException("ID must be numeric");
    }
  }

  private void zipRule(AddrWindow addr) throws RuleException {
    String zip = addr.getZipValue();
    try {
      Integer.parseInt(zip);
    } catch (NumberFormatException e) {
      throw new RuleException("Zip must be numeric");
    }
    if (zip.length() != 5) {
      throw new RuleException("Zip must be exactly 5 digits");
    }

  }

  private void stateRule(AddrWindow addr) throws RuleException {
    if (!addr.getStateValue().matches("[A-Z]{2}")) {
      throw new RuleException(" State must have exactly two characters in the range A-Z ");
    }
  }

  private void equalRule(AddrWindow addr) throws RuleException {
    if (addr.getIdValue().equals(addr.getZipValue())) {
      throw new RuleException("ID field may not equal zip field");
    }

  }
}
