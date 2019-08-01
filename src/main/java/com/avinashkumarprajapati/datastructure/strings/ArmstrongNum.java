
package com.avinashkumarprajapati.datastructure.strings;

public class ArmstrongNum
{ static String s="";
public static void main(String arg[])
{
	for(int i=1;i<=1000;i++)
	{ int sum=0,temp,n=i;
		while(n>0)
		{ 
			temp=n%10;
			sum=sum+temp*temp*temp;
			n=n/10;
		}
		if (sum==i)
		{
			s=s+i+" ";
		}
	}
	System.out.println("ArmstrongNumbers are "+s);
}

}