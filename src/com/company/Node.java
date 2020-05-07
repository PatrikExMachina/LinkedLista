package com.company;

public class Node <T> {
    //moste specificera vilken typ vår data ska ha


    private T data;
    private Node<T> next;

    public Node(T data){
        this.data = data;
        next = null;
    }

    public Node(T data,Node<T> next){
        this.data = data;
        this.next = next;
    }


    public T getData(){
        return data;
    }

    public void setData(T data){

        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
