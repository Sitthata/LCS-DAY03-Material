package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            if (i == 5)
                break;
            i++;
        }
    }

    public static void plusFive(int number) {
        System.out.println(number + 5);
    }

    public static int plusFiveWithReturn(int number) {
        return number + 5;
    }

    public static int calculateRectangleArea(int width, int height) {
        return width * height;
    }

    public static int calculateCircleArea(int radius) {
        return (int) (Math.PI * radius * radius);
    }
}