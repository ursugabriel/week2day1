package com.cgm.internship.week2day1.part1;

import java.util.Arrays;

public class QueueArray<T> {
    private int front;
    private int rear;
    private static int DEFAULT_SIZE=5;
    T[] queue;

    public QueueArray(){
        this(DEFAULT_SIZE);
    }

    public QueueArray(int initSize){
        this.queue=(T[]) new Object[initSize];
        this.front=-1;
        this.rear=-1;
    }

    public boolean isEmpty(){
        return (front==-1 &&rear==-1);
    }

    public T enQueue(T value){

        if((rear+1)%DEFAULT_SIZE==front){
            throw new IllegalStateException("Queue is full!");
        }
        else if(isEmpty()){
            front++;
            rear++;
            queue[rear]=value;
        }
        else {
            rear=(rear+1)%DEFAULT_SIZE;
            queue[rear]=value;
        }
        return value;
    }

    public T deQueue(){
        T value=null;
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty, can't dequeue");
        }
        else if(front==rear) {
            value = queue[front];
            front = -1;
            rear = -1;
        }
        else {
            value = queue[front];
            queue[front]=null ;
            front=(front+1)%DEFAULT_SIZE;
        }
        return value;
    }

    @Override
    public String toString() {
        return "QueueArray{" +
                "front=" + front +
                ", rear=" + rear +
                ", size=" + DEFAULT_SIZE +
                ", queue=" + (queue == null ? null : Arrays.asList(queue)) +
                '}';
    }
}
