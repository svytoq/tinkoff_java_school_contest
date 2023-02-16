import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, k;
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();
        int[] p = new int[n];
        int[] a = new int[m];
        int[] b = new int[m];
        boolean[] checkDone = new boolean[m];
        int countOfCheckDone = 0;
        int count = 0;

        for (int i = 0; i < n; i++){
            p[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++){
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            if(p[a[i]-1] == p[b[i]-1]){
                checkDone[i] = true;
                countOfCheckDone++;
            }
        }



        while (countOfCheckDone < m) {

            int[] countMaxP = new int[k];
            int maxP = 0;
            int numberOfMaxP = 0;
            for (int i = 0; i < m; i++) {
                if (!checkDone[i]) {
                    countMaxP[p[a[i]-1]-1]++;
                    countMaxP[p[b[i]-1]-1]++;
                }
            }

            for (int i = 0; i < k; i++) {
                if (numberOfMaxP <= countMaxP[i]) {
                    maxP = i+1;
                    numberOfMaxP = countMaxP[i];
                }
            }

            for (int i = 0; i < m; i++) {
                if (!checkDone[i]) {
                    if (a[i] == maxP) {
                        b[i] = maxP;
                        count++;
                        break;
                    }
                    if (b[i] == maxP) {
                        a[i] = maxP;
                        count++;
                        break;
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                if (p[a[i]-1] == p[b[i]-1]) {
                    checkDone[i] = true;
                    countOfCheckDone++;
                }
            }
        }
        System.out.println(count);
    }
}