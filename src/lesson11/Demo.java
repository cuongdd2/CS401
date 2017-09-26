package lesson11;

import java.util.*;

public class Demo {

  public static void main(String[] args) {
    Cuong<ArrayList<Integer>> cuong = new Cuong<>(new ArrayList(), new ArrayList());
  }

  static public int count(List<String> list, String target) {
    int count = 0;
    list.stream()
        .filter(s -> Objects.equals(s, target))
        .count();

    return count;
  }

  public static <T extends Comparable> T max(List<T> list) {
    return list.stream().max(Comparable::compareTo).orElse(null);
  }

  public <T> T display(List<T> list) {
    list.forEach(System.out::println);
    return list.get(0);
  }

  public void copyFirstToEnd2(List<?> items) {

  }


}

class Cuong<K extends List<Integer>> {

  private K key;
  private K value;

  public Cuong(K key, K value) {

  }
}

