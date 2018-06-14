package com.droidmanifester.indiantidetimes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WeatherActivty extends AppCompatActivity {

    DBHelper dbHelper;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_activty);
        dbHelper=new DBHelper(WeatherActivty.this);
        textView=findViewById(R.id.textView);
        String d = dbHelper.getPoses();

        textView.setText(d);

    }
}
