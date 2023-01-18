package A더하기B빼기8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int b;
        int num = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> anum = new ArrayList<>();
        ArrayList<Integer> bnum = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            arr.add(a+b);
            anum.add((a));
            bnum.add((b));
        }
        for (int i = 0; i < n; i++) {
            num++;
            System.out.println("Case #" +num +": "+anum.get(i)+" + "+bnum.get(i)+" = "+arr.get(i));
        }
    }
}
