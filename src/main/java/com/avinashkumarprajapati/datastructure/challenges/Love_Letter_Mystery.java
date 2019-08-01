/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.challenges;

/**
 *
 * @author AVINASH KUMAR
 */ 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Love_Letter_Mystery
 {
   
public static void main(String[] args) throws  Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int count=0;
        int N= Integer.parseInt(br.readLine());
        String [] strArr= new String[N];
        for(int i=0;i<N;i++)
         {
            strArr[i]= br.readLine();  
         }
        
      //System.out.println(strArr[0]); 
       // System.out.println(strArr[1]);
                HashSet  hs = new HashSet();

        Love_Letter_Mystery sss= new Love_Letter_Mystery();
     // hs = sss.check(strArr);
       
        //System.out.println(hs.size());
        sc.close();
    }
    public static void  check(String [] s)
        {

        HashSet  []h = new HashSet[s.length];
for(int i = 0; i < s.length; i++)
{
  for(int j = 0; j < s[i].length(); j++)                                            
    {
     h[i].add(s[i].charAt(j));
    }
}
for(int i = 1; i < s.length; i++)
{
    h[0].retainAll(h[i]);
}
System.out.println("\nA"+h[0].iterator()); 

//        return h[0];
        
    }
}