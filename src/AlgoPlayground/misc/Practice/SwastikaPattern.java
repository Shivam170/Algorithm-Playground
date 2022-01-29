package AlgoPlayground.misc.Practice;

public class SwastikaPattern {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 || j == n / 2) {
                    System.out.print("* ");
                } else if (i == 0 && j >= n / 2) {
                    System.out.print("* ");
                } else if (i == n - 1 && j <= n / 2) {
                    System.out.print("* ");
                } else if (j == 0 && i <= n / 2) {
                    System.out.print("* ");
                } else if (j == n - 1 && i >= n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
