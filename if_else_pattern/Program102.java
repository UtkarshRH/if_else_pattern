package if_else_pattern;

public class Program102 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 5; i >= 1; i--) {
            if (i == 1) {
                for (int j = 1; j <= (n * 2) - 1; j++) {
                    System.out.print(i);
                }
            } else {
                for (int j = i; j <= n; j++) {
                    System.out.print(i);
                }
                for (int j = 1; j <= ((i - 1) * 2) - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= n; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
