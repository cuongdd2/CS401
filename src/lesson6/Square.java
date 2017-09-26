package lesson6;

public class Square extends Rec {

  private int side;

  public Square(int w, int h) {
    super(w, h);
    this.side = w;
  }

  @Override
  public int getArea() {
    return side * side;
  }
}
