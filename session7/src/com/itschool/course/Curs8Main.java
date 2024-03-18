package com.itschool.course;

public class Curs8Main {
    public static void main(String[] args) {
        int[] complexArray1 = {1, 2, 3,};
        int[] complexArray2 = {1, 2, 1,};
        int[] complexArray3 = {1, 0, 3,};
        int[][] complexArray = {complexArray1, complexArray2, complexArray3};
        for (int[] ComplexArray : complexArray) {
            for (int[] element : complexArray) {
                System.out.println(element + "");
            }
            System.out.println("=====");
        }
    }
}
