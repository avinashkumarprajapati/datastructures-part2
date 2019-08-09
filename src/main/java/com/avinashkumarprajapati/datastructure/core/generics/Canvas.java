package com.avinashkumarprajapati.datastructure.core.generics;

import java.util.List;

public class Canvas {
    public void draw(Shape s) {
        s.draw(this);
    }
    /* why static is not allowed here?   */
    public   void drawAll(List<? extends Shape> shapes) {
        for (Shape s: shapes) {
            s.draw(this);
        }
    }
}
