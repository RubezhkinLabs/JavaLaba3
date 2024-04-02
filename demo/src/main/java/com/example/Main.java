package com.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        test(1000);
    }
    public static void test(int count){
        ArrayList<Integer> aList = new ArrayList<>();
        long startTime = System.nanoTime();
        for(int i = 0; i < count; i++)
            aList.add(i);
        long endTime = System.nanoTime();
        System.out.println("ArrayList add " + count + " " + (endTime-startTime)/1000000.0);

        startTime = System.nanoTime();
        for(int i = 0; i < count; i++)
            aList.get(i);
        endTime = System.nanoTime();
        System.out.println("ArrayList get " + count + " " + (endTime-startTime)/1000000.0);

        startTime = System.nanoTime();
        for(int i = count-1; i >= 0; i--)
            aList.remove(i);
        endTime = System.nanoTime();
        System.out.println("ArrayList remove " + count + " " + (endTime-startTime)/1000000.0);

        LinkedList<Integer> lList = new LinkedList<>();
        startTime = System.nanoTime();
        for(int i = 0; i < count; i++)
            lList.add(i);
        endTime = System.nanoTime();
        System.out.println("LinkedList add " + count + " " + (endTime-startTime)/1000000.0);

        startTime = System.nanoTime();
        for(int i = 0; i < count; i++)
            lList.get(i);
        endTime = System.nanoTime();
        System.out.println("LinkedList get " + count + " " + (endTime-startTime)/1000000.0);

        startTime = System.nanoTime();
        for(int i = count-1; i >= 0; i--)
            lList.remove(i);
        endTime = System.nanoTime();
        System.out.println("LinkedList remove " + count + " " + (endTime-startTime)/1000000.0);
    }
}