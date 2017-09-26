package interview;

public class TicTacToe {

  public static final int WIN_NUM = 5;

  public static void main(String[] args) {
    int[][] board = new int[][]{
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, -1, 0, 0, 0, -1, 0},
        {0, 0, 1, 0, 1, 0, 0, 0},
        {0, 0, 0, 1, -1, -1, 0, 0},
        {0, 0, 0, -1, 0, -1, 0, 0},
        {0, 0, -1, 1, 0, 1, 0, 0},
        {0, 0, 0, 1, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 0}
    };
//        int[] play = new int[] {1, 4, 4};
    int[] play = new int[]{-1, 5, 2};
    System.out.println(isWin(board, play));
  }

  public static boolean isWin(int[][] board, int[] play) {
    int n = board.length;
    int side = play[0];
    int x = play[1];
    int y = play[2];
      if (board[y][x] != 0) {
          return false;// already played
      }

    board[y][x] = side;
    int played2Win = WIN_NUM - 1;

    int minX = Math.max(-x, -played2Win);
    int maxX = Math.min(n - 1 - x, played2Win);
    int minY = Math.max(-y, -played2Win);
    int maxY = Math.min(n - 1 - y, played2Win);

    return check1Way(board, side, x, y, minX, maxX, 1, 0) ||// check horizontal
        check1Way(board, side, x, y, minY, maxY, 0, 1) ||// check vertical
        check1Way(board, side, x, y, Math.max(minX, minY), Math.min(maxX, maxY), 1, 1) ||
// check diagonal down
        check1Way(board, side, x, y, -Math.min(maxY, -minX), Math.min(maxX, -minY), 1,
            -1);// check diagonal up
  }

  private static boolean check1Way(int[][] board, int side, int x, int y, int leftDiff,
      int rightDiff, int stepX, int stepY) {
      if (rightDiff - leftDiff < WIN_NUM) {
          return false;
      }
    int count = 0;
    for (int i = leftDiff; i <= rightDiff; i++) {
        if (board[y + stepY * i][x + stepX * i] == side) {
            count++;
            if (count == WIN_NUM) {
                return true;
            }
        } else {
            count = 0;
        }
    }
    return false;
  }
}
