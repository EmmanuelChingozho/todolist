package com.emmanuelcargobrothers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Question 1
        List<String> myFruit = new ArrayList<>();


        myFruit.add("Kiwi");
        myFruit.add("Banana");
        myFruit.add("Apple");
        myFruit.add("Strawberry");

        System.out.println(myFruit);

        myFruit.add(0,"Peach");

        System.out.println(myFruit);

        myFruit.add(1,"Plum");

        System.out.println(myFruit);

        myFruit.remove(2);
        myFruit.remove(3);

        System.out.println(myFruit);

        myFruit.remove(1);

        System.out.println(myFruit);

        //Question 2

        Integer[] my_array =  {1,2,3,4,5};
        List<Integer> myList = Arrays.asList((my_array));
        System.out.println(myList);


        //Question 3
        List<String> myFruit2 = new ArrayList<>();


        myFruit2.add("Kiwi");
        myFruit2.add("Banana");
        myFruit2.add("Apple");
        myFruit2.add("Strawberry");

        Collections.swap(myFruit2,0,3);

        System.out.println(myFruit2);


        //Question 4
        List<Integer> integers = new ArrayList<>();

        integers.add(111);
        integers.add(222);
        integers.add(333);
        integers.add(444);
        integers.add(555);
        integers.add(666);
        System.out.println(integers.subList(0,3));




















    }
}
