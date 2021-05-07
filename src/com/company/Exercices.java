package com.company;

import java.util.List;

public class Exercices {
    //This class contains the methods for the following exercices:
    //1. Write a program that selects the largest number from an array.
    //2. Write a program that solves a quadric equation.

    //Returns the largest number from a given list of integers.
    public static int GetLargestNumberFromGivenList(List<Integer> givenList){
        int maxNumber = givenList.get(0);
        for (int number: givenList) {
            if(number > maxNumber){
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    //Prints the result of a quadric equation calculation.
    public static void CalcultateQuadricEquation (double a, double b, double c){
        double root1, root2;
        double determinant = Math.pow(b, 2)- (4.0 * a * c);
        double sqrt = Math.sqrt(determinant);
        if(determinant > 0){
            root1 = (-b + sqrt / (2 * a));
            root2 = (-b - sqrt / (2 * a));
            System.out.println("If determinant is > 0, the result of quadric equation has 2 roots: " + root1 + " and " + root2);
        }else if (determinant == 0){
            root1 = root2 = -b / (2 * a);
            System.out.println("If determinant is = 0, both of the roots will have the same value: " + root1);
        }else{
            System.out.println("Roots are not real.");
        }
    }
}
