import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int longOfLine = number.length();
        int countOf = 0;
        boolean[] chekerArray = new boolean[10];
        boolean flag = false;

        for (int i = 0; i <= longOfLine - 10; i++){
            String str = number.substring(i, i+10);
            String newStr = str.replaceAll("\\?", "");
            countOf = 10 - newStr.length();
            Long intStr = Long.parseLong(newStr);
            while (intStr > 0){
                int b = (int) (intStr % 10);
                chekerArray[b] = true;
                intStr /=10;
            }
            for (boolean bool: chekerArray){
                if (bool){
                    countOf++;
                }
            }
            if( countOf >=10){
                flag = true;
            }
            chekerArray = new boolean[10];
        }
        if (flag){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

