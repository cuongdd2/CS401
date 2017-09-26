package lab8.prob4;

import java.util.Arrays;
import java.util.List;

public class Best {

  public static int countWords(List<String> words, char c, char d, int len) {
    return (int) words.stream()
        .filter(s -> s.matches(String.format("[^%c]*%c+[^%c]*{%d}", d, c, d, len))).count();
  }

  public static void main(String[] args) {
    System.out.println(countWords(Arrays.asList("ccd", "acc", "ccc"), 'c', 'd', 3));
  }
}
