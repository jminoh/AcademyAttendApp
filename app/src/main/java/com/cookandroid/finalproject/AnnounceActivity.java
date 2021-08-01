package com.cookandroid.finalproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AnnounceActivity extends Activity {

    Button btnHome, btnAttendance, btnCalendar, btnPhoto, btnAnnounce;
    ContactsContract.Data[] INDEX_DATA;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.announce);

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


        final String[] announce = {"6월 승품단심사 대상자 연습일정","4월 승품단심사 합격자 목록",
                "5/1 5월 승급심사 일정", "4/29 5월 수련계획표",
                "4/17 현장학습 잘 다녀왔습니다","4/10 현장학습 안내",
        "4/3 4월 생일파티 일정"};
        ListView list = (ListView)findViewById(R.id.listView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, announce);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
                builder.setTitle("공지").setMessage(announce[arg2]);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "OK Click", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                Toast.makeText(getApplicationContext(), announce[arg2],
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
