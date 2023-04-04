package 문자열;

import java.util.Scanner;

public class P5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='A' && s.charAt(i) <='C') n+= 3;
            if (s.charAt(i)>= 'D' && s.charAt(i) <= 'F') n+= 4;
            if (s.charAt(i)>= 'G' && s.charAt(i) <= 'I') n+= 5;
            if (s.charAt(i)>= 'J' && s.charAt(i) <= 'L') n+= 6;
            if (s.charAt(i)>= 'M' && s.charAt(i) <= 'O') n+= 7;
            if (s.charAt(i)>= 'P' && s.charAt(i) <= 'S') n+= 8;
            if (s.charAt(i)>= 'T' && s.charAt(i) <= 'V') n+= 9;
            if (s.charAt(i)>= 'W' && s.charAt(i) <= 'Z') n+= 10;
        }
        System.out.println(n);
    }
}
