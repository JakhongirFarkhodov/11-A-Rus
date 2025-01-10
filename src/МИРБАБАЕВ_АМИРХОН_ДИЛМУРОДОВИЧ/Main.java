package МИРБАБАЕВ_АМИРХОН_ДИЛМУРОДОВИЧ;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите y: ");
        double y = scanner.nextDouble();

        System.out.println((x > 0 && y < 0) ? "Да" : "Нет");
    }
}