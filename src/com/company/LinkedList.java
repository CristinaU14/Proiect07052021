package com.company;

import java.util.List;

public class LinkedList {
    Node head; //head of list

    public void InsertNode(LinkedList list, int data){
        Node newNode = new Node(data);

        //Verify if first element from list is the head.
        if (head == null){
            head = newNode;//head becomes the new node
        } else {//after we have a head it will go direclty here
            Node last = list.head; // we start from the first node that we know and that one is the head
            while(last.next != null){
                last = last.next; // last node becomes the next one
            }
            last.next = newNode;
        }
    }

    public void PrintNodeData(LinkedList list, int data){
        Node last = list.head;

        System.out.println("Linked List value is: ");
        while(last.next != null){ //while
            System.out.println(last.data + " ");
        }
    }
}
