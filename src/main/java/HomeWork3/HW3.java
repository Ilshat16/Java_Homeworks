package HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
//        1. Удалить все четные элементы из списка
//        List<Integer> numbers = new ArrayList<>();
//        Random rand = new Random();
//        for (int i = 0; i < 10; i++) {
//            numbers.add(rand.nextInt(10));
//        }
//        System.out.println(numbers);
//        removeEvenNumber(numbers);
//        System.out.println(numbers);

//        2. Удалить строки, которые являются целыми числами
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
    }

    static void removeEvenNumber(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
    }

    static void removeIntegers(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            try {
                Integer.parseInt(strings.get(i));
                strings.remove(i);
                i--;
            } catch (NumberFormatException e) {
            }
        }
    }
}
