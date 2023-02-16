import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Filter[] filters = new Filter[n];
        int[] a = new int[n];
        int[] p = new int[n];
        int[] l = new int[n];
        for (int i = 0; i<n; i++){
            filters[i] = new Filter();
            filters[i].setA(scanner.nextInt());
        }
        for (int i = 1; i<n; i++){
            filters[i].setP(scanner.nextInt());
        }
        for (int i = 1; i<n; i++){
            filters[i].setL(scanner.nextInt());
        }

        for (int i = 1; i < n; i++){
            int fullLength = filters[i].getL();
            int aa = filters[i].getA();
            Filter filterNow = filters[i];
            while (aa>=fullLength){
                if(filterNow.getP() == 0){
                    break;
                }
                filterNow = filters[filterNow.getP()-1];
                filterNow.setCount(filterNow.getCount()+1);
                fullLength += filterNow.getL();
            }

        }

        for (int i = 0; i<n; i++){
            System.out.print(filters[i].getCount() +" ");
        }
    }
}

class Filter{
    private int a = 0;
    private int p = 0;
    private int l = 0;
    private int count = 0;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}