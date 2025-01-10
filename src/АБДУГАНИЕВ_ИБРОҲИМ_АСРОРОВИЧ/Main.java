package АБДУГАНИЕВ_ИБРОҲИМ_АСРОРОВИЧ;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();

        String text = (a > 0 && b > 0 && c < 0) || ( b < 0 && a > 0 && c > 0 ) || (c > 0 && b > 0 && a < 0) ? "ровно два числа положите":"не один из числа не положительны";
        System.out.println(text);
    }
}