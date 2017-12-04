package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		Button button = (Button)findViewById(R.id.testBut);
		Button button1 = (Button)findViewById(R.id.but);

		//button.setOnClickListener(myDraw);
		button1.setOnClickListener(this);
	}
	public void onClick(View view) {
		Intent intent = new Intent(this, Main3Activity.class);
		startActivity(intent);
	}
}
