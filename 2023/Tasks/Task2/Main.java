import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] intArray = new int[n];
        int count = 0;

        int startDegree = -1;

        int maxDegree = 0;
        boolean plusINF = true;
        boolean[] boolArray = new boolean[n];
        for (int i = 0; i < n; i++){
            String[] str1 = scanner.nextLine().split("\\s");
            intArray[i] = Integer.parseInt(str1[0]);
            if (str1[1].equals("-")){
                boolArray[i] = false;
            }else {
                boolArray[i] = true;
            }
        }

        for (int i = 0; i<n; i++){
            if (!boolArray[i]){
                plusINF = false;
                count = i;
                break;
            }
        }

        if (!plusINF) {
            while (true) {
                maxDegree = startDegree;
                boolean flag = false;
                for (int i = count + 1; i < n; i++) {
                    maxDegree += intArray[i];
                    boolean checker;
                    if (maxDegree >= 0){
                        checker = true;
                    }else {
                        checker = false;
                    }
                    if (!(checker == boolArray[i])) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }

                if (flag) {
                    break;
                } else {
                    startDegree--;
                }
            }
            System.out.println(maxDegree);
        }else{
            System.out.println("inf");
        }
    }
}