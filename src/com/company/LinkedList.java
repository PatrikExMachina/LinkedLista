package com.company;

public class LinkedList <T> {

    private Node<T> head;
    private Node<T> tail;
    private Node<T> current;

    public LinkedList() {
        head = null;
        tail = null;
        current = null;
    }


    public void insert(T data) {
        // så fort head pekar på någonting så vet vi att det finns något i listan

        if (head == null) {
            head = new Node<T>(data);
            tail = head;
            current = head;
        } else {
            tail.setNext(new Node<T>(data));
            //flytta tail till den referensen den pekar på och ge den den referesen.
            tail = tail.getNext();
        }
    }

    public void printList() {

        current = head;
        while (current != null) {
            System.out.print(current.getData());
            if (current.getNext() != null) {
                System.out.print(" -> ");
            } else {
                System.out.println(" -| ");
            }
            current = current.getNext();
        }

    }

    public int length() {

        current = head;
        int counter = 0;
        while (current != null) {
             counter ++;
            current = current.getNext();
        }
        return counter;

    }

    public LinkedList deleteValue(LinkedList list,T key)
    {

        //Variabel för att hålla reda på vilken node som är head node
        Node currNode = list.head, prev = null;


        //Om den nuvarande noden inte är null och och data för den noden är keyen så sätt head till nösta nod för att
        //radera den nuvarande

        if (currNode != null && currNode.getData() == key) {
            list.head = currNode.getNext();

            System.out.println(key + " found and deleted");

            return list;
        }

        //Medans den nuvarande noden inte är null och data för den nuvarande noden inte är keyen
        // Sätt previous till den nuvarande och nuvarande till nästa nod
        while(currNode != null && currNode.getData() != key){

            prev = currNode;
            currNode = currNode.getNext();
        }

        if (currNode != null) {
           //Eftersom den nuvarande noden har keyen så ta bort den

            prev.setNext(currNode.getNext());

            // Printa att den hitatts
            System.out.println(key + " found and deleted");
        }

        if (currNode == null) {
            // Eller att den inte hittats
            System.out.println(key + " not found");
        }

        // returnera Listan utan keyen
        return list;
    }

    public LinkedList deletePosition(LinkedList list, int position)
    {

       //Håll reda på head och föregående nod
        Node currNode = list.head, prev = null;

       //Om positionen är 0 och noden inte är null
        if(position == 0 && currNode != null)
        {
            //Byt ut head mot den noden den pelar på som nästa
            list.head = currNode.getNext();

            //och printa ut att den blivit borttagen
            System.out.println(position + " deleted.");

            return list;
        }


        //En counter för att hålla reda på vart vi är
        int counter = 0;


        //Medans den nuvarande noden inte ahr null-värde
        while(currNode != null){


            //Om counter är samma som argumentet position vi matat in där vi vill ta bort en nod
            if(counter == position){

               //Sätt next för den föregående till den som current för närvarande petar på
                prev.setNext(currNode.getNext());
                System.out.println(position + " deleted");
                break;
            }

            else{
                //annars sätt föregående till den nuvarande
                prev = currNode;
                //Och den nuvarande noden till den som den nuvarande för tillfället pekar på som next
                currNode = currNode.getNext();
                counter++;
            }

        }

        //Om current är lika med null så skriv ut att elementet inte hittades
        if (currNode == null) {
            System.out.println(position + " index not found");
        }


        // return den nya listan
        return list;

    }

    public void deleteAllValues(LinkedList list, T value){

        for(int i = 0; i <list.length();i++){
            this.deleteValue(list, value);
        }
        list.printList();
    }

    }


