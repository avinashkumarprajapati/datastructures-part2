/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.basic;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author AVINASH KUMAR
 */
public class TestPalash1 {
    
    public static void main(String [] args)
    {
        int []ar = {3,30,34,5,9};
          ArrayList<Integer> al=new ArrayList<Integer>();
          for(int i=0;i<ar.length;i++)
          al.add(ar[i]);
          Collections.sort(al,Collections.reverseOrder());
        
        for(int i=0;i<ar.length;i++)
        System.out.println(al.get(i));
     
    
    }
}
