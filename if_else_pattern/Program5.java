package if_else_pattern;

public class Program5 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (i < j) {
                    System.out.print(j);
                } else {
                    System.out.print(i);

                }
            }
            System.out.println();
        }
    }
}
