package if_else_pattern;

public class Program6 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = n; j >= 1; j--) {
                if (j > i) {
                    System.out.print(j);
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
