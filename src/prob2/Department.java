package prob2;

public abstract class Department {

  private StringQueue queue = new StringQueue();

  public StringQueue getQueue() {
    return queue;
  }

  //implement
  abstract public String getName();

  public void addMessage(String msg) {
    queue.enqueue(msg);
  }

  public String nextMessage() throws EmptyQueueException {
    return queue.dequeue();
  }
}
