package A더하기B빼기7;

import java.lang.reflect.Array;
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
        for (int i = 1; i <= n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            arr.add(a+b);
        }
        for (int e : arr) {
            num++;
            System.out.println("Case #" +num +": "+e);
        }
    }
}
