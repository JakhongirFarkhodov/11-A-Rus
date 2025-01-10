package ЗАЙНУДДИНОВ_ФИРДАВС_БАХТИЁР_ЎҒЛИ;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A: ");
        int a = scan.nextInt();
        System.out.print("B: ");
        int b = scan.nextInt();

        String text = a < 0 ? "Число a < 0 " : a > 0 ? "Число a > 0 " : "Число 0";
        String text2 = b > -2 ? "Число b > -2" : b < -2 ? "Число b < -2" : "Число -2";
        System.out.println(text);
        System.out.println(text2);
    }
}