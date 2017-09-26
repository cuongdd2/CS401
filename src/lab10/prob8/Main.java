package lab10.prob8;

public class Main {

  public static void main(String[] args) {
    Queue queue = new Queue();
    createThread(queue);
  }

  private static void createThread(Queue q) {
    Runnable r = () -> {
      for (int i = 0; i < 10000; i++) {
        q.add("" + i);
        q.remove();
        q.add("" + i);
      }
    };
    for (int i = 0; i < 500; i++) {
      new Thread(r).start();
    }

    System.out.println(q.remove());
  }
}
