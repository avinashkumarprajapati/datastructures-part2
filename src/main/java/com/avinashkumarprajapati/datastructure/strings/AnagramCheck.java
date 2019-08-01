
package com.avinashkumarprajapati.datastructure.strings;

public class AnagramCheck
{
 public static void main(String [] arg)
 { System.out.println(arg[0]);
     StringBuilder ss= new StringBuilder("Ram");
// ss=ss+"Shyam";
 System.out.println(ss);
 	String word="illepille";
 	String anagram="pilleille";
boolean br= isAnagram( word ,anagram);
if(br==true)
{System.out.println("anagram");}
else
{
    System.out.println("Notanagram");
}
 }
 public static boolean isAnagram(String word ,String anagram)
 	{
 	if(word.length()!=anagram.length())
 		{
 			
 			return false;
 		}
        char [] chars = word.toCharArray();
 		for(int i=0;i<word.length();i++)
 		{
 			int index =anagram.indexOf(chars[i]);
 			if(index!=-1)
 			{anagram= anagram.substring(0,index)+anagram.substring(index+1,anagram.length());

 			}
 			else
 			{
 				return false;

 			}
 			
 			
 		}
 		return anagram.isEmpty();
 	}

}
