package org.example;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private void accessMe() {
        System.out.println("You can't access me!");
    }

    public int calculateArea() {
        return width * height;
    }
}
