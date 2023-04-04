package 문자열;

import java.util.Scanner;

public class P10890 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [26];
        String s = sc.nextLine();
        for(int a = 0; a<arr.length; a++) {
            arr[a] = -1;
        }
        for (int i = 0; i<s.length(); i++) {
            if (arr[i] == -1) arr[s.charAt(i)-'a'] = i;
        }
        for (int e : arr) System.out.print(e + " ");
    }
}
