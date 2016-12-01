package com.flaborfit.dilip.flaborfit;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        final RelativeLayout settingsBackground = (RelativeLayout) findViewById(R.id.activity_settings);
        Switch nightMode = (Switch) findViewById(R.id.switch_night_mode);
        nightMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    settingsBackground.setBackgroundColor(Color.parseColor("#A9A9A9"));
                    Toast.makeText(getApplicationContext(),"Night mode ON",Toast.LENGTH_SHORT).show();
                }else{
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        settingsBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_purple,getTheme()));
                    }else{
                        settingsBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
                    }
                    Toast.makeText(getApplicationContext(),"Night mode OFF",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
