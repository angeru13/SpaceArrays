package ru.samsung.itschool.spacearrays;


import android.graphics.Canvas;
import android.graphics.Paint;

public class TestRect implements Drawable{
    float x,y, s=20;
    Paint p = new Paint();

    public TestRect(float x, float y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public void draw(Canvas canvas) {
        canvas.drawRect(x,y,x+s,y+s,p);
    }
}
