package by.academy.les03.hw;

import java.util.Scanner;

/*
Задание 25
 */
public class Task3Cycle {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите целое число");
        int res = 1;
        while (!n.hasNextInt()) {
            System.out.println("Нужно ввести целое число");
            n.nextLine();
        }
        int x = n.nextInt();
        for (int i = 1; i <= x; i++) {
            res = res * i;
        }
        System.out.println("Факториал числа  " + x + "  равен = " + res);
    }
}
