package ru.samsung.itschool.spacearrays;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MyDraw extends View implements View.OnClickListener{

	ArrayList objects = new ArrayList();

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.sky = new Sky();

		objects.add(new TestCircle(50,50));
		objects.add(new TestCircle(1000,250));
		objects.add(new TestRect(200,50));
		objects.add(new TestRect(100,300));
		rocket = new ControlledRocket();//(BitmapFactory.decodeResource(getResources(), R.drawable.rocket));
		//this.rocket2 = new ControlledRocket();
		this.dobav_object = new dobav_object (BitmapFactory.decodeResource(getResources(), R.drawable.dobav_object));
	}
	Paint paint = new Paint();
	ControlledRocket rocket, rocket2;
	Sky sky;
	dobav_object dobav_object;

	@Override

	protected void onDraw(Canvas canvas) {
		for (Object obj:objects){
			if (obj instanceof Drawable)
				((Drawable)obj).draw(canvas);
		}

		//sky.draw(canvas);
		//rocket.draw(canvas);
		//rocket2.draw(canvas);
		//rocket.move();
		//rocket2.move();
		//dobav_object.draw(canvas);
		//dobav_object.move();
		// Запрос на перерисовку экрана
		invalidate();
	}
	void sky(){
	}


	public boolean onTouchEvent(MotionEvent event){
		for (Object obj:objects){
			if (obj instanceof Touchable)
				((Touchable)obj).touch(event.getX(),event.getY());
		}
		return super.onTouchEvent(event);
	}

	@Override
	public void onClick(View v) {
		for (int i=0; i<10;i++){
			objects.add(new TestCircle(i*30,i*30));
		}
	}

	//void drawSky(Canvas canvas){
	//}
	//void drawRocket(Canvas canvas, float x, float y, float vx, float vy) {
	//}

	//void drawdobav_object(Canvas canvas, float x, float y, float vx, float vy) {
	//}
}
