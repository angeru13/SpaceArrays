package ru.samsung.itschool.spacearrays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageManager.resources = getResources();
        setContentView(R.layout.activity_main3);
        MyDraw myDraw = (MyDraw) findViewById(R.id.myDraw1);
    }
}
