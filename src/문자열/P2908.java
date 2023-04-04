package 문자열;

import java.util.Scanner;

public class P2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String reS1 = "";
        String reS2 = "";
        for (int i = s1.length()-1; i>=0; i--){
            reS1 += s1.charAt(i);
            reS2 += s2.charAt(i);
        }
        System.out.println(Integer.parseInt(reS1) > Integer.parseInt(reS2) ? reS1 : reS2);
    }
}
