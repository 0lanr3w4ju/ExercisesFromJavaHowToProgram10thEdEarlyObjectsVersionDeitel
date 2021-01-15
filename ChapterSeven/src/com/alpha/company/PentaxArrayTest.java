package com.alpha.company;

import org.junit.jupiter.api.Test;

class PentaxArrayTest {

    @Test
    void test() {
        String[] names = new String[]{"Ibukun", "Onyi", "Akokaite"};


        System.out.println("implementing for loop..");
        System.out.println();
        for (int i = 0; i < names.length; i++) {
            System.out.println("name at index "+ i +" is "+ names[i]);
            System.out.println();
        }

        System.out.println("implementing while loop..");
        System.out.println();
        int counter = 0;
        while (counter < names.length) {
            System.out.println("name at index "+ counter +" is "+ names[counter]);
            System.out.println();
            counter++;
        }
    }

    @Test
    void multiDimensionalArrayTest() {
        int[][] grades = new int[4][4];

        for (int[] grade : grades) {
            for (int i : grade) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    @Test
    void passHundredValuesIntoHundredElement() {
        float[] hundredElement = new float[100];

        int total = 0;
        for (int i = 0; i < 100; i++) {
            hundredElement[i] = i;
            total += i;
        }
        System.out.println(total);
    }

}