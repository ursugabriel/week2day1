package com.cgm.internship.week2day1.part1;


import java.util.Arrays;
import java.util.Iterator;

public class StackArray <T> {

    private T array[];
    private int top;
    private int size;
    private static final int DEFAULT_SIZE=10;

    public StackArray(){
        this(DEFAULT_SIZE);
    }
    public StackArray(int initSize){
        array=(T[]) new Object[initSize];
        top=-1;
    }

    public void add(T element){
        array[++top]=element;
    }

    public void remove(int element){
        array[element]=null;
    }
    public T get(int i){
        return array[i];
    }

//    public void list(StackArray[T] array){
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
//    }

    public T peek() {
        if(top==-1) {
            return null;
        }
        return  array[top];
    }

    public T pop() {
        if(top==-1) {
            return null;
        }
        T itemT = array[top];
        array[top--]=null;
        return itemT;
    }

    public void push(T itemT) {
        array[++top]=itemT;
    }

    public boolean isEmpty() {
        return (top==-1);
    }

    public int size() {
        return (top+1);
    }

    @Override
    public String toString() {
        return "StackArray{" +
                "array=" + (array == null ? null : Arrays.asList(array)) +
                ", top=" + top +
                ", size=" + size +
                '}';
    }
}

