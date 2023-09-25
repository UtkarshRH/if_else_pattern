/*
    1
   222
  33333
 4444444
555555555
 4444444
  33333
   222
    1
 */

package if_else_pattern;

public class Program78 {
    public static void main(String arsg[]) {
        int n = 5;
        for (int i = 1; i <= (n * 2) - 1; i++) {
            if (i <= n) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(i);
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(i);
                }
            } else {
                for (int j = i; j > n; j--) {
                    System.out.print(" ");
                }
                for (int j = i; j <= (n * 2) - 1; j++) {
                    System.out.print((n * 2) - i);
                }
                for (int j = i; j < (n * 2 - 1); j++) {
                    System.out.print((n * 2) - i);
                }
            }
            System.out.println();
        }
    }
}
