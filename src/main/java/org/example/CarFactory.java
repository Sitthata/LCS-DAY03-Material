package org.example;

import java.util.Arrays;

public class CarFactory {
    static String[] cars = new String[10];
    static int carCount = 0;

    public static void main(String[] args) {
        String ford = "Ford Car";
        String bmw = "BMW Car";

        buildCar(ford);
        buildCar(bmw);
//        removeCar(2);
        updateCar(2, "Toyota Car");

        viewStorage();
    }

    public static void buildCar(String newCar) {
        cars[carCount] = newCar;
        carCount++;
    }

    public static void removeCar(int index) {
        for (int i = index; i < carCount; i++) {
            cars[i] = cars[i + 1];
        }
        cars[carCount - 1] = null;
        carCount--;
    }

    public static void updateCar(int index, String updatedCar) {
        if (index > carCount - 1) {
            System.out.println("This place is empty! try update existing car");
            return;
        }

        cars[index] = updatedCar;
    }

    public static void viewStorage() {
        System.out.println(Arrays.toString(cars));
    }
}
