package J01_Java_Basic_Programs.Character_Pattern;

public class CharPat40 {
    public static void main(String[] args) {

        int row = 12;
        int str = 12;
        char c = 'Z';

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (i == 0 || i == row - 1 || j == row - 1 - i) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
    Z Z Z Z Z Z Z Z Z Z Z Z
                        Z
                      Z
                    Z
                  Z
                Z
              Z
            Z
          Z
        Z
      Z
    Z Z Z Z Z Z Z Z Z Z Z Z
*/