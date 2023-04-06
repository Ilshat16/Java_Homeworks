package HomeWork4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        /*
        Реализовать приложение, которое:
        Принимает от пользователя и запоминает строки
        Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
        Если введено revert, то удаляем последнюю введеную строку
        Если введено exit, то завершаем программу

        java
        c++
        python
        c#
        print
        < [c#, python, c++, java]
        revert
        print
        < [python, c++, java]
        exit
         */

        Scanner scan = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        String str = scan.nextLine();
        while (!str.equals("exit")) {
            if (str.equals("print")){
                System.out.println(strings);
            }
            else {
                if (str.equals("revert")) {
                    strings.remove(0);
                } else {
                    strings.add(0, str);
                }
            }
            str = scan.nextLine();
        }
    }
}
