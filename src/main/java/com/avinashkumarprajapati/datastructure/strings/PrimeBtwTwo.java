
package com.avinashkumarprajapati.datastructure.strings;

public class PrimeBtwTwo
{static String s="";
	public static void main(String [] a)
	{ int n1=1,n2=100;
		for(int i=n1;i<=n2;i++)
		{ int ctr=0;
			for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						ctr++;
					}
				}
				if(ctr==2)
				{s=s+i+" ";}

		}
		System.out.println(s);


	}
}