package com.pluralsight;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        float number1 = 0f;
        double number2 = 0;
        BigDecimal number3 = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {
            number1 += .1f;
            number2 += .1;
            number3 = number3.add(new BigDecimal("0.1"));
        }

        System.out.println("FIRST LOOP");
        System.out.println("Float: " + number1);
        System.out.println("Double: " + number2);
        System.out.println("BigDecimal: " + number3);
        System.out.println("-------------");

        number1 = 0f;
        number2 = 0;
        number3 = BigDecimal.ZERO;

        for (int i = 0; i < 1000; i++) {
            System.out.println("-------------");
            number1 += 19.99f;
            System.out.println("Float: " + number1);
            number2 += 19.99;
            System.out.println("Double: " + number2);
            number3 = number3.add(new BigDecimal("19.99"));
            System.out.println("BigDecimal: " + number3);
            System.out.println("-------------");
            System.out.println();
        }

        System.out.println();
        System.out.println("-------------");
        System.out.println("SECOND LOOP");
        System.out.println("Float: " + number1);
        System.out.println("Double: " + number2);
        System.out.println("BigDecimal: " + number3);
        System.out.println("-------------");
        System.out.println();

        number3.add(new BigDecimal("1.00"));

        System.out.println("-------------");
        System.out.println("Question 3:");
        System.out.println("BigDecimal: " + number3);
        System.out.println("-------------");


    }
}
