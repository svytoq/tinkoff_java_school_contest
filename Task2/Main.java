import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long count = 0;
        while ( n > 0 & m > 0){
            if (n > m){
                n -= m;
                ++count;
            }else {
                m -= n;
                ++count;
            }
        }
        System.out.println(count);
    }
}