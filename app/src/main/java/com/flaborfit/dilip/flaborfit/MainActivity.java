package com.flaborfit.dilip.flaborfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXERCISE_WEIGHTS = "Weight Lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";
    public static final String EXTRA_ITEM_TITLE = "extra.item.title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout buttonWeight = (RelativeLayout) findViewById(R.id.relativelayout_weight_lifting);
        buttonWeight.setOnClickListener(this);

        RelativeLayout buttonYoga = (RelativeLayout) findViewById(R.id.relativelayout_yoga);
        buttonYoga.setOnClickListener(this);

        RelativeLayout buttonCardio = (RelativeLayout) findViewById(R.id.relativelayout_cardio);
        buttonCardio.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.image_settings:
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                break;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.relativelayout_weight_lifting:
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);
                break;
            case R.id.relativelayout_yoga:
                loadDetailActivity(MainActivity.EXERCISE_YOGA);
                break;
            case R.id.relativelayout_cardio:
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);
                break;
        }
    }

    void loadDetailActivity(String exerciseTitle) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        startActivity(intent);
    }
}
