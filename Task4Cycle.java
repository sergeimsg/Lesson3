package by.academy.les03.hw;

import java.util.Random;
import java.util.Scanner;

/*
Задание 31
 */
public class Task4Cycle {
    public static void main(String[] args) {
        Random comp = new Random();
        int x;
//        x = comp.nextInt(15);
//        Scanner guess = new Scanner(System.in);
//        System.out.println("Подсказка, компьютер сгенерировал = " + x);
        System.out.println("Угадайте число от 1 до 15");
        int y;
        do {
            x = comp.nextInt(15);
            Scanner guess = new Scanner(System.in);
          //  System.out.println("Подсказка, компьютер сгенерировал = " + x);
            System.out.println("Ваша ставка ");
            y = guess.nextInt();
            System.out.println("Ваше  число " + y);
            System.out.println("Компьютер выбрал " + x);
           }
        while (x != y);

       System.out.println("Угадали!!!" + "  число компьютера = " + x +"  Ваше число = " + y);
    }
}
