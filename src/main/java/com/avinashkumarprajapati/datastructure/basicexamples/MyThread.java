/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avinashkumarprajapati.datastructure.basicexamples;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AVINASH KUMAR
 */
public class MyThread extends Thread{
    public void run()
    {
    System.out.println("Avinash");
     
    }
    
    public static void main(String [] args) throws ClassNotFoundException
    { 
       
        MyThread tt = new MyThread();
        MyThread ttt = new MyThread();
    //    Object t = Class.forName(MyThread).newInstance();
//       synchronized(tt)
//       {
//       
//           System.out.println("Avinash");
//       }
        
        try {
             ttt.start();
            ttt.wait(10);
           
             tt.start();
              ttt.notify();
           
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    
    }
    
}
