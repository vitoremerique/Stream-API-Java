package org.example.Functional_interface_examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> saudacao = ()->"Ola, mundo!";

        List<String> listaSaudacao = Stream.generate(saudacao)
                .limit(5)
                .toList();



        listaSaudacao.forEach(System.out::println);


        List<String> lista = Stream.generate(()->"Ola, mundooo!")
                .limit(5)
                .toList();

        lista.forEach(System.out::println);


    }

}
