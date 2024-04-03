public class printDiamond {
  public static void main(String[] args) {
    // Homework
    // .....* //5"" + 1*
    // ....*** //4"" + 3*
    // ...***** //3"" + 5*
    // ..******* //2"" + 7*
    // ********* //1"" + 9*
    // ..******* //2
    // ...***** //3
    // ....*** //4
    // .....* //5
    // 01234 i
    // 13579 target

    // 5678 i
    // 0 -1 - 2 -3 n-i
    // 0 -2 -4 -6 (n-i)*2
    // 7 5 3 1 target

    // 3 4 i
    // 0 -1 n-i
    // 0 -2
    // 3 1 target

    // 7 8 9 10 11 12 i
    // 0 -1 -2 -3 -4 -5 n-i
    // 0 -2 -4 -6 --8 -10
    // 11 9 7 5 3 1

    // 5678
    // 2345

    // 357 n
    // 3711

    // space
    // 5678
    // 2345
    //

    // space
    // 34
    // 23

    // 7 8 9 10 11 12
    // 2 3 4 5 6 7

    int n =41;
    for (int i = 0; i < n * 2 - 1; i++) {
      String star = "";
      String space = "";
      if (n > i) {
        for (int j = 0; j < i * 2 + 1; j++) {
          star += "*";
        }
        for (int k = 0; k < n - i; k++) {
          space += " ";
        }
      }
      if (n <= i) {
        for (int j = 0; j < (n - i) * 2 + 2 * n - 3; j++) {
          star += "*";
        }
        for (int k = 0; k < i - n + 2; k++) {
          space += " ";
        }
      }

      System.out.println(space + star);
    }

  }
}
