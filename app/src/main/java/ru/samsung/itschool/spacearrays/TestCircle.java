package ru.samsung.itschool.spacearrays;


import android.graphics.Canvas;
import android.graphics.Paint;

public class TestCircle implements Drawable,Touchable {

    float x,y,r=10;
    Paint p = new Paint();
    public TestCircle(float x, float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(x,y,r,p);
    }

    @Override
    public void touch(float x, float y) {
        r+=10;
    }
}
