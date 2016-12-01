package com.flaborfit.dilip.flaborfit;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textTitle = (TextView) findViewById(R.id.text_title);
        ImageView imageMain = (ImageView) findViewById(R.id.image_main);
        LinearLayout linearBackground = (LinearLayout) findViewById(R.id.linearlayout_main_background);

        //Get data from the first activity
        String exerciseText = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        textTitle.setText(exerciseText);

        if(exerciseText.equalsIgnoreCase(MainActivity.EXERCISE_CARDIO)){
            linearBackground.setBackgroundColor(Color.parseColor("#57b25c"));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                imageMain.setImageDrawable(getResources().getDrawable(R.drawable.heart,getApplicationContext().getTheme()));
            }
        }else if(exerciseText.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)){
            linearBackground.setBackgroundColor(Color.parseColor("#926cce"));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                imageMain.setImageDrawable(getResources().getDrawable(R.drawable.lotus,getApplicationContext().getTheme()));
            }
        }

        SharedPreferences prefs = getSharedPreferences("SESSION", Context.MODE_PRIVATE);
        if (prefs.getBoolean("nightmode", false)) {
            linearBackground.setBackgroundColor(Color.parseColor("#A9A9A9"));
        }

    }
}
