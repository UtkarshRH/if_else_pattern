package if_else_pattern;

public class Program86 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
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
            for (int j = i - 1; j >= 1; j--) {
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
