package lab9.prob6;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Prob6 {

  public Set<String> union(List<Set<String>> sets) {
    return sets.stream().reduce((set1, set2) -> {
      set1.addAll(set2);
      return set1;
    }).get();
  }

  public static void main(String[] args) {
    Set<String> s1 = new LinkedHashSet<>(Arrays.asList("A", "B"));
    Set<String> s2 = new LinkedHashSet<>(Arrays.asList("D"));
    Set<String> s3 = new LinkedHashSet<>(Arrays.asList("1", "3", "5"));
    List<Set<String>> sets = Arrays.asList(s1, s2, s3);
    System.out.println(sets);
    Prob6 prob6 = new Prob6();
    System.out.println(prob6.union(sets));
  }
}
