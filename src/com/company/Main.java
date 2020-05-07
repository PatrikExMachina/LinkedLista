package com.company;

import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {

      /*
        Node<Integer> head = new Node<Integer>(1);
        Node<Integer> tmp = new Node<Integer>(2);
        head.setNext(tmp);
        //Vi kan återanvända tmp då head nu pekar på den och således kommer den inte städas bort om vi tar bort referensen
        tmp = new Node<Integer>(3);
        //För att få noden med värdet två att peka ut den nya temp
        //Kan göras på olika sätt, VI kan använda en tail som alltid pekar ut det som ligger sist*/
      // skaoar en node som har värdet 1 ocn pekar på tail


        LinkedList<String> myList2 = new LinkedList<String>();
        myList2.insert("LINKED");
        myList2.insert("LIST");

        myList2.printList();







    }
}
