package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class dobav_object {
    float x,y,vx,vy;
    Bitmap pic;

    dobav_object(Bitmap pic){
        this.x = 0;
        this.y = 0;
        this.vx = 7;
        this.vy = 7;
        this.pic = pic;
    }

    void move(){
        this.x += this.vx;
        this.y += this.vy;
    }

    Paint paint = new Paint();
    Matrix matrix = new Matrix();

    void draw(Canvas canvas){

        matrix.setScale(0.5f, 0.5f);
        //Study mathematics, dear young programmer :)
        double A = 0.01;
       //matrix.postRotate((float)Math.toDegrees(Math.atan2((double)(A+=0.1),(double)(A+=0.1))));
        matrix.postRotate((float)Math.toDegrees((float)Math.toDegrees(Math.atan2(vy, vx)) + 380));
        matrix.postTranslate(x, y);
        //TranslateAnimation(Context context, AttributeSet attrs)
        paint.setAlpha(200);
        canvas.drawBitmap(pic, matrix, paint);
    }
}
