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
/* IMPORTANT: Multiple classes and nested static classes are supported */
// uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
/*StringTokenizer tk = new StringTokenizer(input.readLine());
int m = Integer.parseInt(tk.nextToken());
String s = tk.nextToken();*/


class TestClass {
    public static void main(String args[] ) throws Exception {
        
         //Read input from stdin and provide input before running
BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tk1 = new StringTokenizer(input.readLine());  
int N1 = Integer.parseInt(tk1.nextToken());
int N2 = Integer.parseInt(tk1.nextToken());
        int []array1=new int[N1];
        int []array2=new int[N2];
        int []one=new int[N1];
        int []two=new int[N2];
        StringTokenizer tk2 = new StringTokenizer(input.readLine());  
        int sum1=0,sum2=0,k=0,l=0;
        for (int i = 0; i < array1.length; i++) 
        {
        	array1[i]=Integer.parseInt(tk2.nextToken());
        }
        
                StringTokenizer tk3 = new StringTokenizer(input.readLine());  
         for (int i = 0; i < array2.length; i++) 
        {
        	array2[i]=Integer.parseInt(tk3.nextToken());
        }
         
        for (int i = 0; i < array1.length; i=i++) 
        {
        	if(i%2==0)
        	{
        	one[k++]=array1[i]+array2[i+1];
        	}
        	else 
        	{
        	two[l++]=array2[i]+array1[i+1];
        	}
        }
         for (int i = 0; i < array1.length; i++) 
        {
        	sum1+=one[i];
        	 sum2+=two[i];
        }
        

        System.out.println(sum1+"\n"+sum2);
    }
}
