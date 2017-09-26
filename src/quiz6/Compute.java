package quiz6;

interface Compute {

  default int operation(int x, int y) {
    return x - y;
  }

  static int add(int x, int y) {
    return x + y;
  }
}
