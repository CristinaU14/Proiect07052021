package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercices {
    //This class contains the methods for the following exercices:
    //1. Write a program that selects the largest number from an array.
    //2. Write a program that solves a quadric equation.
    //3. Write a program that checks which number is missing from a list starting from 1 to 5000.

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

    //Creates a list of integers starting from 1 to 5000.
    private static List<Integer> AddSpecificNumberOfElementsInList(){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i<= 5000; i++){
            list.add(i);
        }
        return list;
    }

    //Removes a random int number from a list of integers.
    private static List<Integer> RemoveRandomElementFromList() {
        Random random = new Random();
        int rand = random.nextInt(AddSpecificNumberOfElementsInList().size());
        AddSpecificNumberOfElementsInList().remove(rand);
        return AddSpecificNumberOfElementsInList();
    }

    //Finds the missing number from a list of integers.
    public static int FindMissingNumberFromList(){
        int sumOfOriginalList = AddSpecificNumberOfElementsInList().stream().mapToInt(Integer::intValue).sum();
        int sumOfListWithMissingNumber = RemoveRandomElementFromList().stream().mapToInt(Integer::intValue).sum();
        return sumOfOriginalList - sumOfListWithMissingNumber ;
    }
}
