package lesson7;

public interface C {

  default public void m() {
    System.out.println("B");
  }
//    public void m();
}
