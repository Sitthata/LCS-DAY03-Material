package org.example;

import java.util.Arrays;

public class MathUtils {
    

    public static void main(String[] args) {
        int[] testScores = {6, 4, 7, 2, 6, 12, 20, 15};

        System.out.println(sum(testScores));
        System.out.println(average(testScores));
        System.out.println(max(testScores));
    }
    
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        return sum;
    }
    
    public static double average(int[] numbers) {
        return (double) sum(numbers) / numbers.length;
    }

    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }
}
