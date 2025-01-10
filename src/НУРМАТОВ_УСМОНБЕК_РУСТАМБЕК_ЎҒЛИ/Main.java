package НУРМАТОВ_УСМОНБЕК_РУСТАМБЕК_ЎҒЛИ;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int x = sc.nextInt();
        System.out.print("Y: ");
        int y = sc.nextInt();

        String text = x < 0 && y > 0?"лежит во второй координатной четверти":"не лежит";
        System.out.println(text);
    }
}