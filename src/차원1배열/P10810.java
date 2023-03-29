package 차원1배열;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int i;
        int j;
        int k;
        for (int a = 0; a<m; a++) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            for (int b = i; b<=j; b++) {
                arr[b-1] = k;
            }
        }
        for (int e:arr) System.out.print(e+" ");

    }
}
