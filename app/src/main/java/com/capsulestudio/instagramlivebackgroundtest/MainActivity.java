package com.capsulestudio.instagramlivebackgroundtest;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout constraintLayout = (LinearLayout) findViewById(R.id.root_layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }

    public void firstExample(View view) {
        startActivity(new Intent(getApplicationContext(), Ex1Activity.class));

    }

    public void secondEx(View view) {
        startActivity(new Intent(getApplicationContext(), SecondEXActivity.class));
    }
}
