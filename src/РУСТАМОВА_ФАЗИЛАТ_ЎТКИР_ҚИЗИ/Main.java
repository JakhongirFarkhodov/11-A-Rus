package РУСТАМОВА_ФАЗИЛАТ_ЎТКИР_ҚИЗИ;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите число a:");
        int a = vvod.nextInt();
        System.out.print("Введите число b:");
        int b = vvod.nextInt();

        String next = a % 2 == 0 && b % 2 != 0 || a % 2 != 0 && b % 2 == 0 ? "Ровно одно из чисел нечетное":"Ровно одно из чисел четное";
        System.out.println(next);
    }
}