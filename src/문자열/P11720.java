package 문자열;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String num = sc.nextLine();
        int sum = 0;
        char a;
        for (int i=0;i < n; i++) {
            a =  num.charAt(i);
            sum += a-'0';
        }
        System.out.println(sum);
    }
}
