/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author AVINASH KUMAR
 */
public class NewClass {
    public static void main(String [] args)
    {
    try {
     BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tk = new StringTokenizer(input.readLine());  
int m = Integer.parseInt(tk.nextToken());
int n = Integer.parseInt(tk.nextToken());
//s+=tk.nextToken();
        System.out.println("m= "+m+" n="+n);


     
    }
    catch(IOException e)
    {e.printStackTrace();
    }
   
    }
    
}
