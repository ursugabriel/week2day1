package com.cgm.internship.week2day1.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Tests {
    public static void main(String[] args) {

//========================Stack array ===========================================
        StackArray<Integer> stackArray =new StackArray<Integer>();
        stackArray.push(10);
        stackArray.push(20);
        stackArray.push(30);
        stackArray.push(40);
        stackArray.push(50);
        System.out.println(stackArray.toString());
        System.out.println(("StackArray size: "+stackArray.size()));
        System.out.println("Peak value: "+stackArray.peek());
        System.out.println("Value popped: "+stackArray.pop());
        System.out.println(stackArray.toString());
        System.out.println(("StackArray size: "+stackArray.size()));
        System.out.println("Peak value: "+stackArray.peek());
        stackArray.add(60);
        System.out.println("Value added.");
        System.out.println(stackArray.toString());
        System.out.println(("StackArray size: "+stackArray.size()));
        System.out.println("Peak value: "+stackArray.peek());
        System.out.println("Value at specified position: " +stackArray.get(4));

//==================Queue - dequeue and enqueue==============================================

        QueueArray<Integer> queueArray=new QueueArray<Integer>();
        queueArray.enQueue(10);
        queueArray.enQueue(20);
        queueArray.enQueue(30);
        queueArray.enQueue(40);
        queueArray.enQueue(50);
        System.out.println("Current queue: "+queueArray.toString());
        System.out.println("Dequeue value: "+queueArray.deQueue().toString());
        System.out.println("Dequeue value: "+queueArray.deQueue().toString());

        queueArray.enQueue(60);
        queueArray.enQueue(70);
        System.out.println("Current queue: "+queueArray.toString());
        System.out.println("Dequeue value: "+queueArray.deQueue().toString());
        System.out.println("Dequeue value: "+queueArray.deQueue().toString());
        queueArray.enQueue(80);
        queueArray.enQueue(90);
        System.out.println("Current queue: "+queueArray.toString());

//===================Dictionary==============================================================


        Dictionary<String, String> dictionary = new Dictionary<>();
        dictionary.put("dari","Ceva ce dai mai departe!");
        dictionary.put("abecedar","Carte pentru copiii de gradinita!");
        dictionary.put("carne","Produs de mancat!");
//        for (Map.Entry<String,String> entry : dictionary()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " "+value);
//        }
        System.out.println("get value is " + dictionary.get("dari"));
        System.out.println("get value is " + dictionary.get("abecedar"));
        System.out.println("get value is " + dictionary.get("carne"));







        }
}
