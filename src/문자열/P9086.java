package 문자열;

import java.util.Scanner;

public class P9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String st;
        char a;
        char b;
        for (int i = 0; i<n; i++) {
            st = sc.next();
            a = st.charAt(0);
            b = st.charAt(st.length()-1);
            System.out.print(a);
            System.out.println(b);
        }
    }
}
