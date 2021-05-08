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

        //LinkedList Exercise
        LinkedList list = new LinkedList();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second; // Link first node with the second node
        second.next = third; // Link second node with the third node

        //1verify if first node is a head
        //2. primul nod inserat va fi head-ul
        //3. fac iar verificarea si returneaza false --> trebuie sa vad care e ultimul nod din lista
        //4. iterez prin lista pana gasesc un nod null si asta inseamna ca acela este nodul in care pot face insert
        //5.
    }
}
