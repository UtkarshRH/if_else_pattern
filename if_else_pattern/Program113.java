package if_else_pattern;

public class Program113 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            if (i == n) {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 != 0) {
                        System.out.print((char) (j + 64));
                    } else {
                        System.out.print((char) (j + 96));
                    }
                }
                for (int j = n - 1; j >= 1; j--) {
                    if (j % 2 != 0) {
                        System.out.print((char) (j + 64));
                    } else {
                        System.out.print((char) (j + 96));
                    }
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0) {
                        System.out.print((char) (j + 64));
                    } else {
                        System.out.print((char) (j + 96));
                    }
                }
                for (int j = 1; j <= ((n - i) * 2) - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    if (j % 2 != 0) {
                        System.out.print((char) (j + 64));
                    } else {
                        System.out.print((char) (j + 96));
                    }
                }
            }
            System.out.println();
        }
    }
}
