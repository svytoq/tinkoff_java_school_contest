import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
        if (((2*n - m - 1) % 3 == 0) & ((2*m - n - 1) % 3 == 0)) {
            int x = (2 * n - m - 1) / 3 ;
            int y = (2 * m - n - 1) / 3 ;
            count =  getFactorial(x+y)/(getFactorial(x)*getFactorial(y));
        }
        System.out.println(count);
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}