package if_else_pattern;

public class Program44 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= (n * 2) - 1; i++) {
            if (i <= n) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (n - i) + 1; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = i; j < (n * 2); j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i - n + 1; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}