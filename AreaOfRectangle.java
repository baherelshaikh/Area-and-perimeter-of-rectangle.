package AreaOfRectangle;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare variables to store width and height of the rectangle
        double Width, Height;

        // Prompt the user to enter the width of the rectangle
        System.out.println("Please enter the width:");
        Width = input.nextDouble();

        // Prompt the user to enter the height of the rectangle
        System.out.println("Please enter the height:");
        Height = input.nextDouble();

        // Calculate the area and perimeter of the rectangle
        double Area, Perimeter;
        Area = Width * Height;
        Perimeter = (Width + Height) * 2;

        // Prompt the user to choose whether to calculate the area or perimeter
        System.out.println("To calculate the area, press 1");
        System.out.println("To calculate the perimeter, press 2");

        // Read the user's choice
        int x;
        x = input.nextInt();

        // Use conditional statements to determine whether to calculate the area or perimeter
        if (x == 1) {
            System.out.print("Area of Rectangle = ");
            System.out.println(Area);
        } else if (x == 2) {
            System.out.print("Perimeter of Rectangle = ");
            System.out.println(Perimeter);
        } else {
            // Display an error message if the user enters an incorrect number
            System.out.println("Please enter a correct number!");
        }

        // Close the Scanner object to prevent resource leaks
        input.close();
    }

}

