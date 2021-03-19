package com.alpha.company;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
//        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

//        System.out.print("Original values: ");
//        IntStream.of(values).forEach(value -> System.out.printf("%d ", value * 2));
        // forEach method of the IntStream class to iterate through a given collection

//        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        // method count to return numbers of element in a collection
        // of() method of class IntStream

//        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
        // method min() used to find the lowest element in a collection

//        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
        // method max() used to find the highest element in a collection

//        System.out.printf("Sum: %d%n", IntStream.of(values).sum());

//        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());

        System.out.println("CHAPTER 7 EXAMPLE!");

        int[] array;
        array = new int[]{87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
//        System.out.printf("Total of array elements: %d%n", IntStream.of(array).sum());

//        IntStream.of(array).forEach(value -> System.out.printf("value: %d%n", value));


    }
}
