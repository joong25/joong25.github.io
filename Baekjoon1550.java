
/**
 * Baekjoon 1550
 */

import java.util.Scanner;

public class Baekjoon1550 {
    // 16진수를 10진수로 바꾸기
    public static void main(String[] args) {
        // System.out.println("입력:");
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        String[] s = s1.split("");
        int total = 0;

        for (int i = 0; i < s.length; i++) {
            int my = 0;
            switch (s[i]) {
            case "A":
                s[i] = "10";
                int k1 = Integer.parseInt(s[i]);
                my = k1;
                break;
            case "B":
                s[i] = "11";
                int k2 = Integer.parseInt(s[i]);
                my = k2;
                break;
            case "C":
                s[i] = "12";
                int k3 = Integer.parseInt(s[i]);
                my = k3;
                break;
            case "D":
                s[i] = "13";
                int k4 = Integer.parseInt(s[i]);
                my = k4;
                break;
            case "E":
                s[i] = "14";
                int k5 = Integer.parseInt(s[i]);
                my = k5;
                break;
            case "F":
                s[i] = "15";
                int k6 = Integer.parseInt(s[i]);
                my = k6;
                break;
            default:
                int k7 = Integer.parseInt(s[i]);
                my = k7;
                break;
            }
            total = total + my * (int) (Math.pow(16, s.length - (i + 1)));
            // System.out.println(total);
        }

        System.out.println(total);
    }
}