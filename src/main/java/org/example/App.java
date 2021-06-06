/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */
package org.example;

import java.util.Scanner;


public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        App app = new App();

        int area = app.getRoomArea(scanner);

        displayArea(area);
        convertToSI(area);
    }

    private static void convertToSI(int area) {
        final float conversionFactor = 0.09290304f;
        float areaSi;

        areaSi = area * conversionFactor;

        System.out.printf("%.3f square meters\n", areaSi);
    }

    private static void displayArea(int area) {
        System.out.printf("The area is\n%d square feet\n", area);
    }

    private int getRoomArea(Scanner scanner) {
        int length;
        int width;

        System.out.println("What is the length of the room in feet?");
        length = Integer.parseInt(scanner.nextLine());

        System.out.println("What is the length of the room in feet?");
        width = Integer.parseInt(scanner.nextLine());

        System.out.printf("You entered dimensions of %d feet by %d feet.", length, width);

        return width * length;
    }


}
