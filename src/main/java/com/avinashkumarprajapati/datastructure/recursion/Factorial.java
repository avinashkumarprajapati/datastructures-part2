
package com.avinashkumarprajapati.datastructure.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AVINASH KUMAR
 */
public class Factorial {
    
    public static void main(String[] args)
    {
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
        try {
            int inputNumber = Integer.parseInt(br.readLine());
            int result=fact(inputNumber);
                    System.out.println(result);
        } catch (Exception ex) {
           
        }
    
    }
    private static Integer fact(Integer num)
    {
        if(num==0 || num==1)
        {return 1;}
        else 
        {
          return num*fact(num-1);
        }
       
    
    }
    
    
}
