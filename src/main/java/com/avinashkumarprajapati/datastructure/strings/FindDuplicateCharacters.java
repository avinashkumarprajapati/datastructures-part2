package com.avinashkumarprajapati.datastructure.strings;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharacters
{
	public static void main (String [] args)
	{
		String s="Aavinashrr";
		//Scanner sc = new Scanner(System.in);
		FindDup(s);
		//System.out.println("FindDuplicateCharacters"+ss);
	}

	public static void FindDup(String s)
	{
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		 char c;
		 String str="";
		 int length= s.length();
		 for(int i=0;i<length;i++)
		 { c= s.charAt(i);
		 	if(hm.containsKey(c))
		 	{
		 		//str=str+c+" ";
		 		hm.put(c,hm.get(c)+1);
		 	}
		 	else
		 	{
		 		hm.put(c,1);
		 	
		 	}

		 }
		// Iterating through hashmap to print All the duplicate characters
		 Set<HashMap.Entry<Character,Integer>> entryset= hm.entrySet();
		 // System.out.println
		 for(HashMap.Entry<Character,Integer> entry:entryset)
		 {
		 	if(entry.getValue()>1)
		 	{
		 		System.out.println(entry.getKey()+" "+entry.getValue()+" ");
		 	}
		 }

	}
}