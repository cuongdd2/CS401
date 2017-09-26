package lesson10;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class L10 {

  public static volatile int i = 10;


  @Validation(result = "double", value = "4")
  public static double calc(double d) {
    return d * d;
  }

  public static void main(String[] args) {
    for (int j = 0; j < 10; j++) {
      final int n = j;
      Thread t2 = new Thread(new Runner(n + ""));
      t2.start();
    }
  }

  private static void readAnnotation() {
    for (Method f : L10.class.getMethods()) {
      Validation validation = f.getAnnotation(Validation.class);
      if (validation != null) {
        System.out.println(validation.result());
      }
    }
    for (Field a : L10.class.getFields()) {
      System.out.println(a);
    }
  }

  private static void readFile() {
    try (
        BufferedReader buff = new BufferedReader(new FileReader("src/lesson10/L10.java"));
//            BufferedReader buff2 = new BufferedReader(new FileReader("src/lesson10/L102.java"));
    ) {
      buff.lines().filter(s -> s.contains("catch")).forEach(System.out::println);
    } catch (FileNotFoundException e) {
      Arrays.asList(e.getSuppressed())
          .forEach(throwable -> System.out.println(throwable.getMessage()));
    } catch (IOException e) {
      System.out.println("IO error");
    }
  }


}

class Runner implements Runnable {

  private String str;

  public Runner(String data) {
    str = data;
  }

  @Override
  public void run() {
    System.out.println(str);
  }
}
