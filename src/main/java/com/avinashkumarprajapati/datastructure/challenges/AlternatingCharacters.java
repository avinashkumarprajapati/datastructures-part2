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

/*input 
5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB
o/p
3
4
0
0
4
*/

public class AlternatingCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("");
        int count = 0;
        String[] strArr = new String[N];
        for (int i = 0; i < N; i++) {
            strArr[i] = sc.next();

        }
        String str = "";
        for (int j = 0; j < N; j++) {
            count = 0;
            str = strArr[j];
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    count++;

                }
            }
            System.out.println(count);

        }

    }
}
