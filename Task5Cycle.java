package by.academy.les03.hw;
/*
    Задание 37
 */
public class Task5Cycle {
    public static void main(String[] args) {

        int a;
        int b;
        for (a = 10; a <= 99; a++) {

            for (b = 10; b <= 99; b++) {
                double a4 = a * 100 + b;
                double b4 = b * 100 + a;
               // System.out.println(a4 + "---" + b4);
                if (a4 % 99 != 0)
                {
                 continue; }
                if (b4 % 49 !=0)
                {
                    continue; }

                else {
                System.out.println( "Число а = " + a + "   число b = " + b);
                System.out.println("Деление  " + a + b +"/99= " + a4 / 99 + "  Деление " + b+a+"/49 = " + b4 / 49);}
            }

        }

    }
}