package lab9.prob4;

import java.util.stream.IntStream;

public class Prob4 {

  public static void printSquares(int num) {
    IntStream.iterate(1, o -> ++o).limit(4).map(o -> o * o).forEach(System.out::println);
  }

  public static void main(String[] args) {
    printSquares(4);
  }
}
