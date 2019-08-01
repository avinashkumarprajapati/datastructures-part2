/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.basic.patternprogramming;

/**
 *
 * @author AVINASH KUMAR
 */
/* package whatever; // don't place package name! */


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
	public static void main (String[] args) throws Exception
	{
		// your code goes here
		int n=10;
		
		for(int i=0;i<n;i++)// for no. of lines
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				
				
				
			}
			for(int k=0;k<(2*((n-1)-i));k++) //for spaces
				{
				System.out.print(" ");
				}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				
			}
			
			System.out.print("\n");
		}
	}
}