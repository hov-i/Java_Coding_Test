package 심화1;

import java.util.Scanner;

public class P10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(s.length()-(i+1))){
                a = 0;
                break;
            }
            else a=1;
        }
        System.out.println(a);
    }
}
