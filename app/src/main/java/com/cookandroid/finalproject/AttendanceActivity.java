package com.cookandroid.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class AttendanceActivity extends Activity {

    Button btnHome, btnAttendance, btnCalendar, btnPhoto, btnAnnounce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance);

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

        final String[] student = {"김태경", "이학태", "이은서", "안정훈", "이정현", "이경호",
        "박규태", "전서빈", "이현수", "이승우", "서태호", "이평안", "안민경", "김수정",
        "조경선", "김민혜", "안영환", "소은성", "김승준", "주상언", "황단비", "허성빈",
        "최다인", "심다영"};
        ListView list = (ListView)findViewById(R.id.listView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, student);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                Toast.makeText(getApplicationContext(), student[arg2] + " 출석",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
