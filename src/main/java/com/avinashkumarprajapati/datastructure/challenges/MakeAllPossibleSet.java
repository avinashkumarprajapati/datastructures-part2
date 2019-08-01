/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.challenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 *
 * @author AVINASH KUMAR
 */

public class MakeAllPossibleSet
{
    public static void permutation(String str) { 
    permutation("", str); 
}

private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) 
        System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}        

    public static void main(String [] args)
    { MakeAllPossibleSet nc = new MakeAllPossibleSet();
    HashSet hs= new HashSet();
        hs = nc.sett();
//       Iterator itr = hs.iterator();
//       while(itr.hasNext())
//       {
//          // System.out.print(itr.next()+"");
//       }
       String str = hs.toString();
       // System.out.println(str.length());
      str= str.substring(1, str.length()-1);
       // System.out.println("\n"+str);
       
        String str1= "avi";
        // System.out.println(s);
       // NewClass.permutation(s);
       String splitted[]=new String[str.length()];
//String splitted="";

    for(int i=0;i<str.length();i++)
         splitted = str.split(", ");
    String sss="";
        for(String ii:splitted)
        {
            sss +=ii;
            //System.out.print(ii);
        }
        System.out.print("Input string was "+sss+"\n");
        MakeAllPossibleSet.permutation(sss);
        
       
       
        
    }

    private  HashSet sett() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     HashSet hs= new HashSet();
     for(int i=0;i<4;i++)
     {
         for(int j=0;j<4;j++)
         {
         hs.add(j);
         }
     }
     return hs;
    }
    
}
