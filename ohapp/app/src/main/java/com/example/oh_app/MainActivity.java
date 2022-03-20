package com.example.oh_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText text;
    Button showbutton, pagebutton;
    RadioGroup radioGroup;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //앱 아이콘
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.obsicon);

        text= (EditText)findViewById(R.id.text);

        //글자 나타내기
        showbutton= (Button)findViewById(R.id.button);
        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "글자를 입력해주세요.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), text.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        //홈페이지 열기
        pagebutton= (Button)findViewById(R.id.button2);
        pagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent textIntent;
                textIntent= new Intent(Intent.ACTION_VIEW, Uri.parse(text.getText().toString()));
                startActivity(textIntent);
            }
        });

        //사진 선택
        radioGroup= (RadioGroup) findViewById(R.id.radio_group);
        imageView= (ImageView)findViewById(R.id.imageView);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i==R.id.blueradioButton){  //ImageView 파란색으로
                    imageView.setImageResource(R.drawable.bobsicon);
                }else{
                    imageView.setImageResource(R.drawable.obsicon);
                }
            }
        });
    }
}