package org.example.Functional_interface_examples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);
//First form to do
        Consumer<Integer> imprimeNumeroPar = n->{
            if(n % 2 ==0){
                System.out.println(n);
            }
        };

        numeros.stream().forEach(imprimeNumeroPar);
//Second form to do
        System.out.println("------------- second");

        numeros.stream().filter(n -> n % 2 ==0).forEach(System.out::println);
        System.out.println("------------- third");
// third form to do
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if(integer % 2 ==0){
                    System.out.println(integer);
                }
            }
        });
//fourth form to do
        System.out.println("------------- fourth");

        numeros.stream().forEach(n -> {
            if(n % 2 ==0){
                System.out.println(n);
            }
        });
        System.out.println("------------- fiveth");
        numeros.forEach(n -> {
            if(n % 2 ==0){
                System.out.println(n);
            }
        });


    }
}
