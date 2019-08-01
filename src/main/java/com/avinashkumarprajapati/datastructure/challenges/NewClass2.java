/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author AVINASH KUMAR
 */
public class NewClass2 
{
     public static void main(String [] args) throws IOException
    { BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count=2;
    ArrayList [] lists=new ArrayList[count];
    for (int i = 0; i < count; i++) {
    lists[i] = new ArrayList<>();
 lists[i].add(br.readLine());
}
           
          
            System.out.println(lists[0].get(0));
    }
}
