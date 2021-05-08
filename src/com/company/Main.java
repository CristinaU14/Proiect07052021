package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Initializations
        List<Integer> listOne = new ArrayList<Integer>(Arrays.asList(1,2));
        double a = 2;
        double b = 5;
        double c = 7;

        //Methods
        Exercices.GetLargestNumberFromGivenList(listOne);
        Exercices.CalcultateQuadricEquation(a,b,c);
        Exercices.FindMissingNumberFromList();

    }
}
