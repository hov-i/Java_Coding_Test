package X보다작은수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++) {
            int number = sc.nextInt();
            arr[i] = number;
        }
        for (int e : arr) if (e < x) System.out.print(e + " ");
    }

}
