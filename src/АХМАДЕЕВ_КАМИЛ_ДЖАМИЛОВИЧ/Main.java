package АХМАДЕЕВ_КАМИЛ_ДЖАМИЛОВИЧ;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int x = scanner.nextInt();
        if (x < 0 && x % 2 == 0) {
            System.out.println("Отриц четное");
        } else if (x < 0 && x % 2 == 1) {
            System.out.println("Отриц нечетное");


        } else if (x > 0 && x % 2 == 0) {
            System.out.println("Положительное четное");

        } else if (x > 0 && x % 2 == 1) {
            System.out.println("Положительное нечетное");

        } else {
            System.out.println("Ноль");
        }
    }
}