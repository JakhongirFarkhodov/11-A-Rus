package ХОЛОВ_БЕҲРУЗ_ФЕРУЗ_ЎҒЛИ;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Введите число x1:");
        int x1 = cs.nextInt();
        System.out.print("Введите число y1:");
        int y1 = cs.nextInt();
        System.out.print("Введите число x2:");
        int x2 = cs.nextInt();
        System.out.print("Введите число y2:");
        int y2 = cs.nextInt();
        System.out.print("Введите число x3:");
        int x3 = cs.nextInt();
        System.out.print("Введите число y3:");
        int y3 = cs.nextInt();

        double str_a1 = Math.pow(x2 - x1,2);
        double str_a2 = Math.pow(y2 - y1,2);
        double a = Math.sqrt(str_a1 + str_a2);
        double str_b1 = Math.pow(x2 - x3,2);
        double str_b2 = Math.pow(y2 - y3,2);
        double f = Math.sqrt(str_b1 + str_b2);
        double srt_c1 = Math.pow(x1 - x3,2);
        double srt_c2 = Math.pow(y1 - y3,2);
        double g = Math.sqrt(srt_c1 + srt_c2);

        double P = (a + f + g) / 2;
        double S = P - a;
        double S1 = P - f;
        double S2 = P - g;
        double S3 = S * S1;
        double S4 = S3 * S2;
        double S5 = Math.sqrt(P * S4);
        System.out.println(S5);
    }
}