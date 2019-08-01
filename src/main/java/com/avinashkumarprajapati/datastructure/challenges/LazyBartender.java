/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.challenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 *
 * @author AVINASH KUMAR
 */
public class LazyBartender {
    	public static void main (String[] args) throws Exception
	{
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // String line = br.readLine();
        int Ncoc = Integer.parseInt(br.readLine());
        int Ncus = Integer.parseInt(br.readLine());
        
        StringTokenizer []tk = new StringTokenizer[Ncus]; 
	String []c= new String[Ncus];
//	ArrayList<String>  rl = new ArrayList<String>();
	for(int i=0;i<Ncus;i++)
        {
            c[i]= br.readLine();
        }
        for(int i=0;i<Ncus;i++)
        {
          tk[i]=new StringTokenizer(c[i]);
           
         }
        HashSet<String> hs = new HashSet<String> ();
         for(int i=0;i<Ncus;i++)
        {
            while(tk[i].hasMoreTokens())
            {
                //System.out.println(tk[i].nextToken()); 
                hs.add(tk[i].nextToken());
                
          
            }
            
         }
         Iterator itr = hs.iterator();
         while(itr.hasNext())
         {
             System.out.print(" "+itr.next());
         }
        }
}
        
        
    

