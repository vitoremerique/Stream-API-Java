package org.example.Functional_interface_examples.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio3 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Predicate<Integer> nPositos = n->n>0;

       boolean positivos = numeros.stream()
               .allMatch(nPositos);

        System.out.println(positivos);




    }
}
