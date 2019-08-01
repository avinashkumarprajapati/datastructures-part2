
package com.avinashkumarprajapati.datastructure.strings;

import java.util.Scanner;

public class PalindromeStringUsingRecursion
{

	
	public static boolean isPal(String s)
	{
	//if length is 0 or 1 then String is Palindrome
		if(s.length()==0 || s.length()==1)
		{
			return true;
		}
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			return isPal(s.substring(1,s.length()-1));
		}
		return false;


	}

	public static void main(String [] arg)
	{
		//for capturing user input 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		//if function returns true the String is palindrome 
		if(isPal(str))
		{
			System.out.println("String is Palindrome");

		}
		else
		{
			System.out.println("String is Not Palindrome");
		}
	}
}