package lab10.prob1;

import java.util.List;
import java.util.stream.Collectors;

public class TDDPractice {

  public List<String> changeLastCharToUpper(List<String> words) {
    return words.stream()
        .map(s -> s.substring(0, s.length() - 1) + s.substring(s.length() - 1, s.length())
            .toUpperCase())
        .collect(Collectors.toList());
  }
}
