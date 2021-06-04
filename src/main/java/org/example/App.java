package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        App app = new App();
        int area =app.getRoomArea(scanner);
        displayArea(area);
        converttToSI(area);
    }

    private static void converttToSI(int area) {
        System.out.printf("%.3f square meters\n",area*0.09290304);
    }

    private static void displayArea(int area) {
        System.out.printf("The area is\n%d square feet\n",area);
    }

    private int getRoomArea(Scanner scanner) {
        int length;
        int width;

        System.out.println("What is the length of the room in feet?");
        length= Integer.parseInt(scanner.nextLine());

        System.out.println("What is the length of the room in feet?");
        width= Integer.parseInt(scanner.nextLine());

        System.out.printf("You entered dimensions of %d feet by %d feet.",length,width);

        return width*length;
    }


}
