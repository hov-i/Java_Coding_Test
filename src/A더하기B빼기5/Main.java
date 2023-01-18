package A더하기B빼기5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int n = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) break;
            arr.add(a+b);

        }
        for (int e : arr) System.out.println(e);
    }
}
