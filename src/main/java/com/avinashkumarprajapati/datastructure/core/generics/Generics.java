package com.avinashkumarprajapati.datastructure.core.generics;

import java.util.ArrayList;
import java.util.List;

public abstract class Generics {

    public static void main(String[] args) {
        System.out.println("avinash");
        List<String> ls = new ArrayList<String>(); //1
      //  List<Object> lo = ls; //2 => illegal line
        List<Object> lo = new ArrayList<>();
        lo.add(new Object()); // 3
        String s = ls.get(0); // 4: attempts to assign an Object to a String!
    }


}
