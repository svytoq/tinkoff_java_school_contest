import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 4;
        int[] h = new int[n];
        for (int i = 0; i < n; i++){
            h[i] = scanner.nextInt();
        }
        if (((h[0] >= h[1])&&(h[1] >= h[2])&&(h[2] >= h[3]))||((h[0] <= h[1])&&(h[1] <= h[2])&&(h[2] <= h[3]))){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}