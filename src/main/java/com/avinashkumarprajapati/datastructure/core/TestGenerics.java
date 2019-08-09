package com.avinashkumarprajapati.datastructure.core;

import com.avinashkumarprajapati.datastructure.core.generics.Canvas;
import com.avinashkumarprajapati.datastructure.core.generics.Circle;
import com.avinashkumarprajapati.datastructure.core.generics.Rectangle;
import com.avinashkumarprajapati.datastructure.core.generics.Shape;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {

    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape shape2 = new Rectangle();
        Circle circle = new Circle();
        Circle circle1 = new Circle();
        List<Shape> list = new ArrayList<>();
        List<Circle> list2 = new ArrayList<>();
        list.add(shape);
        list.add(shape2);
        list2.add(circle);
        list2.add(circle1);
        Canvas canvas = new Canvas();
        canvas.drawAll(list2);

    }
}
