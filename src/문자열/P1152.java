package 문자열;

import java.util.Scanner;

public class P1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int count = 1;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == ' ') count++;
        }
        if (s == "") {
            System.out.println(0);
        }else{
            System.out.println(count);
        }
    }
}