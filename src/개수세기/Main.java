package 개수세기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int inter;
        int count = 0;
        for (int i = 0; i<n; i++) {
            inter = sc.nextInt();
            arr[i] = inter;
        }
        int find = sc.nextInt();
        for (int e: arr){
            if (find == e) count++;
        }
        System.out.println(count);
    }
}
