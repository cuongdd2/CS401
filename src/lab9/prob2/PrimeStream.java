package lab9.prob2;

import java.math.BigInteger;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimeStream {

  final Stream<BigInteger> primes = LongStream.iterate(2, o -> o + 1).filter(PrimeStream::isPrime)
      .mapToObj(BigInteger::valueOf);
  Supplier<Stream<BigInteger>> supplier = () -> LongStream.iterate(2, o -> o + 1)
      .filter(PrimeStream::isPrime).mapToObj(BigInteger::valueOf);

  private void printFirstNPrimes(long n) {
    supplier.get().limit(n).forEach(System.out::println);
  }

  private static boolean isPrime(long i) {
    if (i < 2) {
      return false;
    }
    if (i < 4) {
      return true;
    }
    for (int j = 2; j <= (int) Math.sqrt(i); j++) {
      if (i % j == 0) {
        return false;
      }
    }
    return true;
  }


  public static void main(String[] args) {
    PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
    ps.printFirstNPrimes(10);
    System.out.println("====");
    ps.printFirstNPrimes(5);
  }
}
