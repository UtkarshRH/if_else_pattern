package if_else_pattern;

public class Program109 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = i; j <= n; j++) {
                    System.out.print(j);
                }
                for (int j = n - 1; j >= i; j--) {
                    System.out.print(j);
                }
            } else {
                for (int j = i; j <= n; j++) {
                    System.out.print(j);
                }
                for (int j = 1; j <= ((i - 1) * 2) - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = n; j >= i; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
