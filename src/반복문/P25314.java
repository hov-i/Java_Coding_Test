package 반복문;

import java.util.Scanner;
public class P25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = a/4;
        for (int i = 0; i < num; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
