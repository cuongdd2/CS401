package interview;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    System.out.println(divisors(60));
  }

  public static String toCapCase(String phrase) {
    // TODO put your code below this comment
    if (phrase == null || phrase.equals("")) {
      return null;
    }
    String[] words = phrase.split(" ");
    String word, capWord;
    for (int i = 0; i < words.length; i++) {
      word = words[i];
      capWord = word.substring(0, 1).toUpperCase() + word.substring(1, word.length());
      words[i] = capWord;
    }
    return String.join(" ", words);
  }

  public static ArrayList<Integer> divisors(int n) {
    // TODO
    ArrayList<Integer> divisorList = new ArrayList<>();
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        divisorList.add(i);
      }
    }
    return divisorList;
  }
}
