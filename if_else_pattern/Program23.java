package if_else_pattern;

public class Program23 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= (n * 2) - 1; i++) {
            if (i <= n) {
                for (int j = i; j <= n; j++) {
                    if (i % 2 != 0) {
                        System.out.print(i);
                    } else {
                        System.out.print(i);
                    }
                }
            } else {
                for (int j = i - n + 1; j >= 1; j--) {
                    if (i % 2 != 0) {
                        System.out.print(i - n + 1);
                    } else {
                        System.out.print(i - n + 1);
                    }
                }
            }
            System.out.println();
        }
    }
}
