package if_else_pattern;

public class Program84 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                if (i % 2 != 0) {
                    System.out.print((char) (i + 64));
                } else {
                    System.out.print((char) (i + 96));
                }
            }
            for (int j = i; j <= n - 1; j++) {
                if (i % 2 != 0) {
                    System.out.print((char) (i + 64));
                } else {
                    System.out.print((char) (i + 96));
                }
            }
            System.out.println();
        }
    }
}
