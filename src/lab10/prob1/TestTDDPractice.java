package lab10.prob1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestTDDPractice {

  @Test
  public void test() {
    List<String> list = Arrays.asList("abc", "def");
    TDDPractice practice = new TDDPractice();

    assertEquals(practice.changeLastCharToUpper(list).get(0), "abC");
    assertEquals(practice.changeLastCharToUpper(list).get(1), "deF");
  }
}
