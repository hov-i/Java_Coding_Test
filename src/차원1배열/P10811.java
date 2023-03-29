package 차원1배열;

import java.util.Scanner;

public class P10811 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int i;
        int j;
        int rever;
        for (int b = 1; b<=n; b++) {
            arr[b-1] = b;
        }
        for (int a = 0; a<m; a++) {
            i = sc.nextInt();
            j = sc.nextInt();
            for (int c = i-1, d = j-1; d<c; d--, c++) {
                rever = arr[d];
                arr[d] = arr[c];
                arr[c] = rever;
            }
        }
        for (int e : arr) System.out.print(e+" ");
    }
}
