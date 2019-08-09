package com.avinashkumarprajapati.datastructure.core.generics;

public class Rectangle extends Shape {
    private int x, y, width, height;
    @Override
    public void draw(Canvas c) {
        System.out.println("rectangle's shape");
    }
}
