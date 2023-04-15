package 심화1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P10812 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int a = 1;
        for (int j = 0; j<n; j++){
            arr[j] = a;
            a++;
        }
        int k;
        int l;
        int o;

        for (int i = 0; i<m; i++){
            k = sc.nextInt();
            l = sc.nextInt();
            o = sc.nextInt();
            int tmp = 0;
            for (int y = o-1; y<l; y++) {
                tmp = arr[k-1];
                arr[k-1] = arr[y];
                arr[y] = tmp;
                k++;

            }
            for (int e : arr) System.out.print(e + " ");
            System.out.println();
        }

    }
}
