package if_else_pattern;

public class Program98 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if (i % 2 != 0) {
                    System.out.print((char) (i + 64));
                } else {
                    System.out.print((char) (i + 96));
                }
            }
            for (int j = 2; j < i + 1; j++) {
                if (i % 2 != 0) {
                    System.out.print((char) (i + 64));
                } else {
                    System.out.print((char) (i + 96));
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if (i % 2 != 0) {
                    System.out.print((char) (i + 64));
                } else {
                    System.out.print((char) (i + 96));
                }
            }
            for (int j = 2; j <= i; j++) {
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
