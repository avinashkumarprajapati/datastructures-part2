/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.basic;

/**
 *
 * @author AVINASH KUMAR
 */
public class Base
{
    public static void main(String [] args)
    {
   new Child();
    }
    
}
class BaseA {
    public BaseA()
    {System.out.println("I am Base Class");}
    
    
}
class Child extends BaseA
{
    public Child()
    {System.out.println("I am Child Class");}
}
