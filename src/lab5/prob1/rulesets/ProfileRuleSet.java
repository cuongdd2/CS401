package lab5.prob1.rulesets;

import lab5.prob1.windows.ProfileWindow;

import java.awt.Component;

final public class ProfileRuleSet implements RuleSet {

  //package level access
  ProfileRuleSet() {
  }

  @Override
  public void applyRules(Component ob) throws RuleException {
    ProfileWindow profile = (ProfileWindow) ob;
    emptyRule(profile);
    idRule(profile);
    favoriteRule(profile);
    nameRule(profile);
  }

  private void emptyRule(ProfileWindow profile) throws RuleException {
    if (isEmpty(profile.getFavoriteMovieValue()) || isEmpty(profile.getFavoriteRestaurantValue())
        || isEmpty(profile.getFirstNameValue()) || isEmpty(profile.getIdValue()) || isEmpty(
        profile.getLastNameValue())) {
      throw new RuleException("All fields must be nonempty");
    }
  }

  private boolean isEmpty(String s) {
    return s == null || s.length() == 0;
  }

  private void idRule(ProfileWindow profile) throws RuleException {
    try {
      Integer.parseInt(profile.getIdValue());
    } catch (NumberFormatException e) {
      throw new RuleException("ID must be numeric");
    }
  }

  private void favoriteRule(ProfileWindow profile) throws RuleException {
    if (profile.getFavoriteMovieValue() == profile.getFavoriteRestaurantValue()) {
      throw new RuleException("Favorite restaurant cannot equal favorite movie");
    }
  }

  private void nameRule(ProfileWindow profile) throws RuleException {
    if (profile.getFirstNameValue().matches(".*[a-zA-Z]") || profile.getLastNameValue()
        .matches(".*[a-zA-Z]")) {
      throw new RuleException(
          "firstname and lastname fields may not contain spaces or characters other than a-z, A-Z");
    }
  }

}
