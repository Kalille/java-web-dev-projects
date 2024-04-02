package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Radius: ");
        double radius = input.nextDouble();
//        double circumference = radius * PI;
        Double area = Circle.getArea(radius);
        System.out.println("The area of your circle with a radius of " + radius + " is: "  + area);

    }
}
