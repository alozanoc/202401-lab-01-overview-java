package pe.edu.upao.transaccionales.lab1.example2;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterAndMapMain {
    public static void main(String[] args) {
        var numbers = Arrays.asList(1,2,3,4,5,6);
        // quiero los números pares, elevados al cuadrado

        System.out.println("Pares cuadrados, con for");
        ArrayList<Integer> paresCuadrado = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                paresCuadrado.add(number * number);
            }
        }
        paresCuadrado.forEach(System.out::println);

        System.out.println("Pares cuadrados, con funciones/lambdas/closures");
        var paresCuadrado2 = numbers.stream()
                .filter(element -> element % 2 == 0)
                .map(element -> element * element)
                .toList();

        paresCuadrado2.forEach(System.out::println);
        System.out.println("Divisible entre 4 con lambdas");


        if(numbers.stream().anyMatch(it -> it % 4 == 0)) {
            System.out.println("La lista contiene un número divisible entre 4");
        }

        System.out.println("Divisible entre 4 con funcional");

        var result = false;
        for (Integer number : numbers) {
            if (number % 4 == 0) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("La lista contiene un número divisible entre 4");

        }

        System.out.println("El primer elemento es: " + numbers.stream().findFirst().orElse(0));

    }
}
