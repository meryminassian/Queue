package com.company;

public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.add(12);
        queue.add(34);
        queue.add(54);
        queue.add(155);
        queue.add(97); //last element => this will be the first element out

        queue.printArray();
        System.out.println("____________________");

        //returning the last element without removing it
        System.out.println("last element is " + queue.poll());
        queue.printArray(); //checking that no element was removed

        System.out.println("____________________");

        //removing and returning the last element
        System.out.println("removed element is " + queue.peek() + " and the remaining array is ");
        queue.printArray(); //checking that the element was removed

//        queue.add(47635);
//        queue.printArray();

    }
}
