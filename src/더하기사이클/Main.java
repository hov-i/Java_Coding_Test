package 더하기사이클;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        int count = 0;
        while (true) {
            num1 = (num1%10)*10+(num1/10+num1%10)%10;
            count++;
            if (num == num1) break;
        }
        System.out.print(count);

    }
}
