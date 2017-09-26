package lesson7;

public interface B {

  default public void m() {
    System.out.println("B");
  }
//    public void m();
}
