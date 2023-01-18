package 최소최대;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 10000000;
        int max = 0;
        int arr[] = new int[n];
        for (int i = 0; i<n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        for (int i = 0; i<n-1; i++) {
            if (arr[i] < arr[i+1]) arr[i] = min;
        }
        System.out.println(min + " " +max);

    }
}
