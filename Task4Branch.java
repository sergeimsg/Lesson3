package branch;

import java.util.Scanner;

/*
Задание 33
 */
public class Task4Branch {
    public static void main(String[] args) {

        int pas1 = 9583;
        int pas2 = 1747;
        int pas3 = 3331;
        int pas4 = 7922;
        int pas5 = 9455;
        int pas6 = 8997;
        int code;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код из доступных\n" +
                "        int pas1 = 9583;\n" +
                "        int pas2 = 1747;\n" +
                "        int pas3 = 3331;\n" +
                "        int pas4 = 7922;\n" +
                "        int pas5 = 9455;\n" +
                "        int pas6 = 8997;");
        code=scanner.nextInt();

        if ((code==pas1) || (code==pas2)) {
            System.out.println("Уровень доступа А,В");}

       else if ((code==pas3) || (code==pas4)) {
            System.out.println("Уровень доступа В,С");}

        else if ((code==pas5) || (code==pas6)) {
            System.out.println("Уровень доступа C");
        }
        else { System.out.println("Уровень доступа отсутствует");}

    }
}
