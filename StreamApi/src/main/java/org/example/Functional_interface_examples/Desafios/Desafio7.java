package org.example.Functional_interface_examples.Desafios;

import java.util.*;

public class Desafio7 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> OptionalInt = numeros.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        OptionalInt.stream().forEach(System.out::println);
    }
}
