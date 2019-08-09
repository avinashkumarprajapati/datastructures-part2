package com.avinashkumarprajapati.datastructure.core.generics;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    public abstract void draw(Canvas c);
    static List<List<? extends Shape>> history =
            new ArrayList<>();
    /*public void drawAll(List<? extends Shape> shapes) {
        history.addLast(shapes);
        for (Shape s: shapes) {
            s.draw(this);
        }}*/

}
