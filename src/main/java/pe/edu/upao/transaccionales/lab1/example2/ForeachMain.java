package pe.edu.upao.transaccionales.lab1.example2;

import java.util.Arrays;
import java.util.List;

public class ForeachMain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Lista de números");
        numbers.forEach(it -> {
            System.out.println(it);
        });
        numbers.forEach(ForeachMain::printNumber);
        numbers.forEach(System.out::println);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Integer it : numbers) {
            System.out.println(it);
        }
    }

    public static void printNumber(Integer it) {
        System.out.println(it);
    }
}


