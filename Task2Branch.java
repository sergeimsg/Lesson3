package branch;

import java.util.Scanner;

/*
Задание 12
 */
public class Task2Branch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        double z;
        System.out.println("Введите 3 действительных числа");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if (x > 0) {
            x = Math.pow(x, 2);
            System.out.println("Получим положительное х = " + x);
        } else {
            x = Math.pow(x, 4);
            System.out.println("Получим отрицательное х = " + x);
        }
        if (y > 0) {
            y = Math.pow(y, 2);
            System.out.println("Получим положительное y = " + y);
        } else {
            y = Math.pow(y, 4);
            System.out.println("Получим отрицательное y = " + y);
        }
        if (z > 0) {
            z = Math.pow(z, 2);
            System.out.println("Получим положительное z = " + z);
        } else {
            z = Math.pow(z, 4);
            System.out.println("Получим отрицательное z = " + z);
        }

    }
}
