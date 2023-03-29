package 차원1배열;

import java.util.Scanner;
public class P10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int i;
        int j;
        int rever;
        for (int b = 1; b<=n; b++) {
            arr[b-1] = b;
        }

        for (int a = 0; a < m; a++) {
            i = sc.nextInt();
            j = sc.nextInt();
            rever = arr[j-1];
            arr[j-1] = arr[i-1];
            arr[i-1] = rever;
        }

        for (int e : arr) System.out.print(e + " ");
    }
}
