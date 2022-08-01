package branch;

import java.util.Scanner;

/*

Задание 24
 */
public class Task3Branch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество лепестков");
        int n = scanner.nextInt();
        if (n % 2 != 0) {
            System.out.println("Не любит");
        } else {
            System.out.println("Любит");
        }
    }
}

