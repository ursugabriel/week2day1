package com.cgm.internship.week2day1.part1;

import java.util.Map;
import java.util.TreeMap;

public class Tests {
    public static void main(String[] args) {
        StackArray<Integer> stackArray =new StackArray<Integer>();
        stackArray.push(10);
        stackArray.push(20);
        stackArray.push(30);
        stackArray.push(40);
        stackArray.push(50);

//        System.out.println(stackArray.toString());
//        System.out.println(stackArray.size());
//        System.out.println(stackArray.peek());
//        System.out.println(stackArray.pop());
//        System.out.println(stackArray.size());
//        System.out.println(stackArray.peek());

        stackArray.add(60);
        System.out.println(stackArray.size());
        stackArray.remove(0);
        System.out.println(stackArray.size());
        System.out.println(stackArray.peek());

        System.out.println(stackArray.get(4));
//        System.out.println(stackArray.list(stackArray));

//        dequeue and enqueue

//        QueueArray<Integer> queueArray=new QueueArray<Integer>();
//        queueArray.enQueue(10);
//        queueArray.enQueue(20);
//        queueArray.enQueue(30);
//        queueArray.enQueue(40);
//        queueArray.enQueue(50);
//        System.out.println(queueArray.toString());
//        System.out.println(queueArray.deQueue().toString());
//        System.out.println(queueArray.deQueue().toString());
//        System.out.println(queueArray.toString());
//
//        System.out.println(queueArray.deQueue().toString());
//        System.out.println(queueArray.deQueue().toString());
//        queueArray.enQueue(60);
//        queueArray.enQueue(70);
//        System.out.println(queueArray.toString());
        //System.out.println(queueArray.peek().toString());


        TreeMap<String,String> dictionary = new TreeMap<String, String>();
        dictionary.put("dari","Ceva ce dai mai departe!");
        dictionary.put("abecedar","Carte pentru copiii de gradinita!");
        dictionary.put("adevar","Ceva adevarat!");
        dictionary.put("carne","Produs de mancat!");


        for(Map.Entry<String,String> entry: dictionary.entrySet() ){
            String key= entry.getKey();
            String value = entry.getValue();

            System.out.println(key+ " =: "+value);
        }


    }
}
