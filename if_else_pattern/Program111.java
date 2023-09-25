package if_else_pattern;

public class Program111 {
    public static void main(String arsg[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                for (int j = n; j >= 1; j--) {
                    System.out.print(j);
                }
                for (int j = 2; j <= n; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                for (int j = 1; j <= ((n - i) * 2) - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
