package if_else_pattern;

public class Program37 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i < (n * 2); i++) {
            if (i <= n) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print((n - i) + 1);
                }
            } else {
                for (int j = i; j > n; j--) {
                    System.out.print(" ");
                }
                for (int j = (n * 2) - 1; j >= i; j--) {
                    System.out.print((i - n + 1));
                }
            }
            System.out.println();
        }
    }
}
