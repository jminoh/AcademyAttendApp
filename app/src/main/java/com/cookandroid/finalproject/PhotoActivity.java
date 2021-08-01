package com.cookandroid.finalproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class PhotoActivity extends Activity {

    Button btnHome, btnAttendance, btnCalendar, btnPhoto, btnAnnounce;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);


        btnHome = (Button)findViewById(R.id.btnHome);
        btnAttendance = (Button)findViewById(R.id.btnAttendance);
        btnCalendar = (Button)findViewById(R.id.btnCalendar);
        btnPhoto = (Button)findViewById(R.id.btnPhoto);
        btnAnnounce = (Button)findViewById(R.id.btnAnnounce);

        final GridView gv = (GridView) findViewById(R.id.gridView1);
        MyGridAdapter gAdapter = new MyGridAdapter(this);
        gv.setAdapter(gAdapter);

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

    public class MyGridAdapter extends BaseAdapter {
        Context context;

        public MyGridAdapter(Context c) {
            context = c;
        }

        public int getCount() {
            return posterID.length;
        }

        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return null;
        }

        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return 0;
        }

        Integer[] posterID = { R.drawable.student1, R.drawable.student2,
                R.drawable.student3, R.drawable.student4, R.drawable.student5,
                R.drawable.student6, R.drawable.student7, R.drawable.student8,
                R.drawable.student9, R.drawable.student10, R.drawable.student11,
                R.drawable.student12, R.drawable.student1, R.drawable.student2,
                R.drawable.student3, R.drawable.student4, R.drawable.student5,
                R.drawable.student6, R.drawable.student7, R.drawable.student8,
                R.drawable.student9, R.drawable.student10, R.drawable.student11,
                R.drawable.student12 };

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new GridView.LayoutParams(200, 300));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5, 5, 5, 5);

            imageview.setImageResource(posterID[position]);

            final int pos = position;
            imageview.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    View dialogView = (View) View.inflate(
                            PhotoActivity.this, R.layout.dialog, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(
                            PhotoActivity.this);
                    ImageView ivPoster = (ImageView) dialogView
                            .findViewById(R.id.ivPhoto);
                    ivPoster.setImageResource(posterID[pos]);
                    dlg.setTitle("0507 송도 현장체험학습");
                    dlg.setIcon(R.drawable.ic_launcher);
                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기", null);
                    dlg.show();
                }
            });

            return imageview;
        }

    }
}
