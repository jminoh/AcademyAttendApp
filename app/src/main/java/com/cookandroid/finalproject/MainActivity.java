package com.cookandroid.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btnHome, btnAttendance, btnCalendar, btnPhoto, btnAnnounce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome = (Button)findViewById(R.id.btnHome);
        btnAttendance = (Button)findViewById(R.id.btnAttendance);
        btnCalendar = (Button)findViewById(R.id.btnCalendar);
        btnPhoto = (Button)findViewById(R.id.btnPhoto);
        btnAnnounce = (Button)findViewById(R.id.btnAnnounce);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                finish();
            }
        });

        btnAttendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AttendanceActivity.class);
                startActivity(intent);

                finish();
            }
        });

        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CalendarActivity.class);
                startActivity(intent);

                finish();
            }
        });

        btnPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PhotoActivity.class);
                startActivity(intent);

                finish();
            }
        });

        btnAnnounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AnnounceActivity.class);
                startActivity(intent);

                finish();
            }
        });
    }
}