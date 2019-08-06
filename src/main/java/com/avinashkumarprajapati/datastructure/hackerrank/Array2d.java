package com.avinashkumarprajapati.datastructure.hackerrank;

/**
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array2d {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer [][] array = new Integer[6][6];
        System.out.println("input ");
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                array[i][j] = sc.nextInt();
                sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            }
        }


       // display(array);
        zigzag(array);

    }

    private static void zigzag(Integer[][] array) {
        List<Integer> list = new ArrayList<>();
        int constraint1=0;
        int constraint2=0;
        /*while(constraint1<4 constraint2<4){

        }*/
        for(int i=constraint1;i<constraint1+3;i++){
            for(int j=constraint2;j<constraint2+3;j++){
               if( j==((i+3)/2)) {
                   if (i == j)
                       System.out.print(array[i][j]);
                   else System.out.print("*");
               }
                else System.out.print(array[i][j]);


            }
            System.out.println();
        }

    }

    private static void display(Integer[][] array) {
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                System.out.print(array[i][j]+" ");

            }
            System.out.println();
        }
    }


}
