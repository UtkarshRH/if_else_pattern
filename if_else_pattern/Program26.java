package if_else_pattern;

public class Program26 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= (n * 2) - 1; i++) {
            if (i <= n) {
                for (int j = n; j >= i; j--) {
                    if (j % 2 != 0) {
                        System.out.print(j);
                    } else {
                        System.out.print(j);
                    }
                }
            } else {
                for (int j = n; j >= (n * 2) - i; j--) {
                    if (j % 2 != 0) {
                        System.out.print(j);
                    } else {
                        System.out.print(j);
                    }
                }
            }
            System.out.println();
        }
    }
}
