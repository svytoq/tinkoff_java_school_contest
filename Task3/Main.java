import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] mas = new long[n];
        int x = 1;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            mas[i] = scanner.nextLong();
        }
        x = ((int) Math.sqrt(mas[0])) + 1;
        long x1 = x;
        while (!flag){
        for (int i = 0; i < n;i++){
            if (ToDo(x1,mas[i]) < 0 ){
                ++x;
                x1 = x;
                flag = false;
                break;
            }
            x1 = ToDo(x1,mas[i]);
            flag = true;
        }
        }
        System.out.println(x);
    }

    public static long ToDo(long k, long a){
        return k*k -a;
    }
}