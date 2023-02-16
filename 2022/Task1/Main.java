import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int x = (a+b)/2;
        if (a<=b){
            System.out.println("NO");
        }else if(a%2 != b%2){
            System.out.println("NO");
        }else if (a - x < n){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}