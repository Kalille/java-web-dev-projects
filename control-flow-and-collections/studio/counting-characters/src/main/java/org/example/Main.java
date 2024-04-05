package org.example;

import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> myObject = new HashMap<>();
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";

//        char[] myStringArray = quote.toCharArray();
//        int counter = 0;
        Scanner input = new Scanner(System.in);

            System.out.print("Enter a bunch of words: ");
            String userInput = input.nextLine();
            char[] inPutArray = userInput.toCharArray();
            for (Character letter : inPutArray){
                if (letter != ' '){
                    char lowerCasedLetter = Character.toLowerCase(letter);
                    int currentCount = myObject.getOrDefault(lowerCasedLetter, 0);
                    int updatedCount = currentCount + 1;
                    myObject.put(lowerCasedLetter,updatedCount);
                }else {
                    System.out.println("white space");
                }
                }

//                System.out.println(letter);
        System.out.println(myObject);

            }






    }
