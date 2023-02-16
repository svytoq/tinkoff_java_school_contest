import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] f = new int[n];
        int maxSum = 0;
        for(int i = 0; i < n; i++){
            f[i] = scanner.nextInt();
        }
        f = Arrays.stream(f).sorted().toArray();


        int now = 1;
        for (int i = 0; i < f.length; i++){
            maxSum = Math.max(maxSum, doMagik(now, f[i], f));
            now = f[i];
        }
        System.out.println(maxSum);
    }


     public static int doMagik(int first, int second, int[] array){
        int maxMax = 0;
        int maxForThisEteration = 0;
        for (int i = first+1; i <=second; i++){
            maxForThisEteration = i;
            int t = 0;
            int qq = 0;
            for (int q = 0; q<array.length; q++){
                if(array[q] / i > 0){
                    t = array[q];
                    qq = q;
                    array[q] = 0;
                    break;
                }
            }
            for (int q = 0; q<array.length; q++){
                maxForThisEteration += array[q] -(array[q] % i);
            }
            maxMax = Math.max(maxMax, maxForThisEteration);
            array[qq] = t;
        }
        return maxMax;
    }
}