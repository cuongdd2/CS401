package lesson10;

public class Singleton {

  private static Singleton singleton;
  public static transient int counter = 0;

  private Singleton() {
    increase();
  }

  public static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }

  private static void increase() {
    int n = 0;
    for (int i = 0; i < 1000000000; i++) {
      n++;
    }
    counter++;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 1; i++) {
      createThread();
    }
  }

  private static void createThread() {
    Runnable r = () -> {
      for (int i = 0; i < 10000; i++) {
        Singleton.getInstance();
      }
    };
    for (int i = 0; i < 500; i++) {
      new Thread(r).start();
    }
    System.out.println(Singleton.counter);
  }
}
