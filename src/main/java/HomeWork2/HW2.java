package HomeWork2;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
//        1. Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N,
//        которая состоит из чередующихся символов c1 и c2, начиная с c1.
//
//        Пример. (n = 6, c1='a', c2='b') -> "ababab"
//        (n = 8, c1='x', c2='y') -> "xyxyxyxy"

//        Scanner iScan = new Scanner(System.in);
//        System.out.printf("Введите первый символ: ");
//        char c1 = iScan.nextLine().charAt(0);
//        System.out.printf("Введите второй символ: ");
//        char c2 = iScan.nextLine().charAt(0);
//        System.out.printf("Введите четное число: ");
//        int n = iScan.nextInt();
//        System.out.println(buildString(n, c1, c2));

//        2. Создать файл file.txt. Если файл уже создан, ничего делать не надо.
//        Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
        createFileWithText();




    }

    static String buildString(int n, char c1, char c2) {
        if(n % 2 != 0) return "Ошибка: n нечетное";
        String res = new StringBuilder().append(c1).append(c2).toString().repeat(n/2);
        return res;
    }

    static void createFileWithText() {
        Path path = Path.of("src\\main\\java\\HomeWork2","file.txt");
        try {
            Files.createFile(path);
            System.out.println("Файл успешно создан");
            String text = "TEXT".repeat(100);
            Files.writeString(path, text);
        } catch (IOException e) {
            System.out.println("Файл уже существует");
        }
    }


}
