package com.company;

public class Queue implements List{
    private int InitialCapacity = 1;
    private Integer[] array = new Integer[InitialCapacity];
    private int index = 0;

    public Queue() {
       
    }

    public Integer[] getArray() {
        return array;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }

    public void resize(){
        Integer[] newarray = new Integer[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        array = newarray;
    }

    @Override
    public void add(int number) {
        if(array.length == index) //full array
            resize();
        array[index] = number;
        index++;
    }

    //returning the last element without removing it
    public Integer poll(){
        return array[index - 1];
    }

    //removing the last element and returning it
    public Integer peek(){
        Integer last = array[index - 1];
        array[index -1] = null;
        index --;
        return last;
    }

    public void printArray(){
        for (int i = 0; i < index; i++) { //after adding index is always greater that the last element's index by 1
            System.out.println(array[i]);
        }
    }


}
