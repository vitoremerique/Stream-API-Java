package org.example.Functional_interface_examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,45,5);


        numeros.forEach(System.out::println);

        Function<Integer,Integer> dobrar = n->n*2;

        System.out.println("----------------");

        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        numerosDobrados.forEach(System.out::println);


        System.out.println("----------------");
        List<Integer> numerosDobradoss = numeros.stream()
                .map(n->n*4)
                .toList();

        numerosDobradoss.forEach(System.out::println);




    }
}
