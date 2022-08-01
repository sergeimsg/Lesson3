package by.academy.les03.hw;
/*
Задание 13
 */

public class Task2Cycle {
    public static void main(String[] args) {
        double x = -5;
        double h = 0.5;
        //double y;
        System.out.println("-------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("-------------------------");
        for (; x <=5; x = x + h) {
            double y;
            y = 5-x*x/2;
            System.out.printf("|\t%4.1f\t|\t%4.3f\t|\n",x,y);

        }

    }
}
