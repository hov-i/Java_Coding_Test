package Lv2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Dalligigungju {
    public static void main(String[] args) {

    }
}
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char a ;
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            a = (char) (a + n);
            answer += a;
        }
        return answer;
    }
}
