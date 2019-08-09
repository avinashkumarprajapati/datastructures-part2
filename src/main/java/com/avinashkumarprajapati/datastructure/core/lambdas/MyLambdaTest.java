package com.avinashkumarprajapati.datastructure.core.lambdas;

public class MyLambdaTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("started");
        });
        t1.start();
    }
}


interface outer {
    Integer sum();
  //  default String myDefa

}