package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;



public class Sky {

    final int numStars = 500;

    int xStar[] = new int[numStars];
    int yStar[] = new int[numStars];
    int alphaStar[] = new int[numStars];

    void sky() {
        int maxX = 2000;
        int maxY = 2000;
        for (int i = 0; i < numStars; i++) {
            xStar[i] = (int) (Math.random() * maxX);
            yStar[i] = (int) (Math.random() * maxY);
            alphaStar[i] = (int) (Math.random() * 256);
        }
    }
    Paint paint = new Paint();
    void draw(Canvas canvas){
        canvas.drawColor(Color.BLACK);
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(2);
        for (int i = 0; i < numStars; i++)
        {
            paint.setAlpha(alphaStar[i]);
            alphaStar[i] += (int)(Math.random() * 11) - 5;
            if (alphaStar[i] > 255) alphaStar[i] = 255;
            if (alphaStar[i] < 0) alphaStar[i] = 0;
            canvas.drawCircle(xStar[i], yStar[i], 3, paint);
        }
    }
}
