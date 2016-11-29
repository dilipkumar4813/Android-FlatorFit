package com.flaborfit.dilip.flaborfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textTitle = (TextView) findViewById(R.id.text_title);

        ImageView imageMain = (ImageView) findViewById(R.id.image_main);

    }
}
