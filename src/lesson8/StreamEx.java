package lesson8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx {

  public static void main(String[] args) {
    String s = "dalksfjlaksdjf;lasjdf;kljasd;lkjfasdkdjfalkjsdkfjdsalkjf";
    List<Integer> list = Arrays.asList(1, 2, 4, 3, 5, 2);
    list.stream().sorted(Comparator.comparingInt(o -> o))
        .forEach(integer -> System.out.println(integer));
    list.forEach(System.out::println);
  }
}
