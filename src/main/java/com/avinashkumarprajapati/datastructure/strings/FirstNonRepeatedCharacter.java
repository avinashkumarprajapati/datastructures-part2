package com.avinashkumarprajapati.datastructure.strings;


import java.util.HashMap;

public class FirstNonRepeatedCharacter
{public static Character FNRC(String s)
{
	String temp=s;
	HashMap <Character,Integer> hm = new HashMap<Character,Integer>();
	char c;
	for(int i=0;i<s.length();i++)
	{ c=s.charAt(i);
		if(hm.containsKey(c))
		{
			hm.put(c,hm.get(c)+1);

		}
		else
		{
			hm.put(c,1);
		}
	}

	for(int i=0;i<s.length();i++)
	{ c=s.charAt(i);
		if(hm.get(c)==1)
			{return c;}
		
	}
	return null;
}
	public static void main(String [] args)
	{
	String s="aaKAvinash";
	char c = FNRC(s);
	
		System.out.println(c);
	// }
	// else
	// {
	// 	System.out.println("Nothing");
	// }
	}



}
