package org.example.Functional_interface_examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,78,75,3,2,5,2,5,455,21);

        BinaryOperator<Integer> soma = (n1,n2)-> n1+n2;

      int result =  numeros.stream()
                .reduce(0,soma);


        System.out.println("A soma total é: "+result);


        int results =  numeros.stream()
                .reduce(0,(n1,n2)->n1+n2);


        System.out.println("A soma total é: "+results);
    }
}
