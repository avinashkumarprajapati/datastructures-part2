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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AVINASH KUMAR
 * Program LazyBartender
 */
public class CodeGrd1 {
    
    public static void main(String [] args)
    {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N1=Integer.parseInt(br.readLine());
            int N2=Integer.parseInt(br.readLine());
            
            ArrayList <String> alc= new ArrayList <String>();
            ArrayList <StringTokenizer> altk = new ArrayList <StringTokenizer>();
            ArrayList <Integer> alhs= new ArrayList <Integer>();
            ArrayList [] al =new ArrayList[N2];
            al[0].add("a0afafa");
            
            for(int i=0;i<N2;i++)
            {
                alc.add(br.readLine());
            }
             for(int i=0;i<N2;i++)
            {
                altk.add(new StringTokenizer(alc.get(i)));
            }
              for(int i=0;i<N2;i++)
            { 
                while(altk.get(i).hasMoreTokens())
                {
                    int x;
               x=Integer.parseInt(altk.get(i).nextToken());
                 alhs.add(x);
                }
            }
              Collections.sort(alhs);
//              
//               for(int i=0;i<N2;i++)
//            {
//                al.add(alhs.get(i));
//            }
//               Collections.sort(al);
               System.out.println(""+alhs.get(0));
            
        } catch (IOException ex) {
            Logger.getLogger(CodeGrd1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
