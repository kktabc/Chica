package com.Chica.test;

import java.util.Scanner;

public class TestMethod {
    static int add(int a, int b){
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number:");

        int a = scanner.nextInt();

        System.out.println("enter second number:");
        int b = scanner.nextInt();

        int c = TestMethod.add(a,b);
        System.out.println("your result is:");
        System.out.println(c);

    }
}
