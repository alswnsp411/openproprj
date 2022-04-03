package com.example.project4_mission;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int i=0;
    ScrollView topview, bottomview;
    ImageView topimg, bottomimg;
    Button movebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("두 개의 이미지뷰");

        topview= (ScrollView) findViewById(R.id.topview);
        bottomview= (ScrollView) findViewById(R.id.bottomview);
        topimg= (ImageView) findViewById(R.id.topimage);
        bottomimg= (ImageView) findViewById(R.id.bottomimage);
        movebtn= (Button) findViewById(R.id.movebtn);

        topview.setHorizontalScrollBarEnabled(true);
        topview.setVerticalScrollBarEnabled(true);
        bottomview.setHorizontalScrollBarEnabled(true);
        bottomview.setVerticalScrollBarEnabled(true);

        topview.setVisibility(View.VISIBLE);
        bottomview.setVisibility(View.INVISIBLE);

        movebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                i=1-i;
                if(i==0){
                    topview.setVisibility(View.VISIBLE);
                    bottomview.setVisibility(View.INVISIBLE);
                }else{  //처음 시작이 i=0
                    topview.setVisibility(View.INVISIBLE);
                    bottomview.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}