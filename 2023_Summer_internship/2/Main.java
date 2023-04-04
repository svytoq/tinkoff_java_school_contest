import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m, k, result;
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();

        if (n*k % m == 0){
            result = (n * k)/m;
        }else {
            result = (n * k)/m + 1;
        }
        System.out.println(result);
    }
}