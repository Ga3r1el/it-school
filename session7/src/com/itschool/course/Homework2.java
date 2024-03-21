package com.itschool.course;

import java.util.Scanner;

public class Homework2 {
    //EX 1.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    //EX 3.
    public static void ex3() {
        int age = 20;
        if (age >= 18) {
            System.out.println("I am an adult.");
        } else {
            System.out.println("I am not an adult.");
        }
    }
}
