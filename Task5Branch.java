package branch;

import java.util.Scanner;

/*
Задание 40
 */
public class Task5Branch {
    public static void main(String[] args) {
        int x;
        double fx;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x");
        x = scanner.nextInt();
        if (x <= 13) {
            fx = -Math.pow(x, 3) + 9;
            System.out.println("fx =  " + fx);
        } else {
            fx = -3 / (x + 1);
            System.out.println("fx = " + fx);
        }
    }
}
