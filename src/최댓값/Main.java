package 최댓값;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int max = 0;
        int n = 0;
        for (int i = 0; i <9; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            if (arr[i]>max) max = arr[i];
            if (arr[i] == max) n = i+1;
        }
        System.out.print(max+"\n"+n);
    }
}
