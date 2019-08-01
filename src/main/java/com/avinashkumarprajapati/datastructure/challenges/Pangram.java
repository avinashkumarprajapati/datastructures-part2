/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.challenges;

/**
 *
 * @author AVINASH KUMAR
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangram {

    public static void main(String[] args) {  
        int count=0;
        Scanner sc =new Scanner(System.in);
        String N=sc.nextLine().toLowerCase();
        if(N.length()<26)
            {System.out.println("not pangram");}
        else
isCompleteString(N);
    }
private static void isCompleteString(String testingString) {
        String resultString= "";
        char[] toChar = testingString.toCharArray();
        int length = toChar.length;
        for (int i = 0; i < length; i++) 
        {
            if(resultString.indexOf(toChar[i])==-1)
            {
                resultString=resultString.concat(toChar[i]+"");

            }
        }
    StringTokenizer tk = new StringTokenizer(resultString);
    
   String resultStr=tk.nextToken();
    resultStr+=tk.nextToken();
//System.out.println(resultStr);
        if(resultStr.length()==26)
            System.out.println("pangram");
        else System.out.println("not pangram");

}
}
