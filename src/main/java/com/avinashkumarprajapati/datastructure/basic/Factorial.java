
package com.avinashkumarprajapati.datastructure.basic;

import java.util.Scanner;

/**
 *
 * @author AVINASH KUMAR
 */
public class Factorial {
    
    public static void main(String [] args)
    { 
       
   
        Scanner sc = new Scanner(System.in);
       int  result= fact(sc.nextInt());
        System.out.println(""+result);
        
        
        
    
    }

    private static int fact(int n) 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(n==0||n==1)
    { return 1;
    }
    return n*fact(n-1);
    }
    
} 

