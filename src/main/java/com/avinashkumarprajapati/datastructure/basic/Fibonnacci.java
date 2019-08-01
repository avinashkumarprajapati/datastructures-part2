
package com.avinashkumarprajapati.datastructure.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author AVINASH KUMAR
 */
public class Fibonnacci {
     public static void main(String[] args)
    {
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
        try {
                 System.out.println("Input Number");
            int inputNumber = Integer.parseInt(br.readLine());
            for(int i=0;i<=inputNumber;i++)
            {
                int result= fibo(i);
                System.out.print(" "+result);
        }
        } catch (Exception ex) {
           
        }
    }
     public static int fibo(int num)
     { if(num==0)
        {
              return 0;
        }
     else if(num==1)
     {
         return 1;
     }
     else
     {
         return fibo(num-1)+fibo(num-2);
     }
     }
     
    
}
