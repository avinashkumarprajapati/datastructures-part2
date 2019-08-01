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



/* Name of the class has to be "Main" only if the class is public. */
public class Hexagon
{
	public static void main (String[] args) throws Exception
	{int n=5;
	int p=7;
	
	for( int i=0;i<n;i++)
	{
		for(int j=0;j<n-i;j++)
		{
			System.out.print(" ");
			
			
		}
		for(int k=0;k<(p);k++)
		{
			System.out.print("*");
		}
		p+=2;
		System.out.print("\n");
	}
	int fp=p;
		for( int i=0;i<n;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(" ");
			
			
		}
		for(int k=0;k<(fp);k++)
		{
			System.out.print("*");
		}
		fp-=2;
		System.out.print("\n");
	}
	}
}