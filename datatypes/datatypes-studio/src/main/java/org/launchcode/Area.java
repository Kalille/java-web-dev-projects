package org.launchcode;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){

        try (Scanner input = new Scanner(System.in)) {
            double radius;
            System.out.println("Enter a Radius: ");
            radius = input.nextDouble();

            if (radius < 0) {
                System.err.println("Radius cannot be negative. Please enter a positive value.");
                System.out.println("Enter a Radius: ");
                input.close();
            }

            Double area = Circle.getArea(radius);
            input.close();
            System.out.println("The area of your circle with a radius of " + radius + " is: " + area);

        } catch (InputMismatchException e) {
            System.err.println("Invalid input: Please enter a valid number");
        }
    }
}
