package com.example.doitmission_07;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button customerbtn;
    Button salesbtn;
    Button goodsbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        customerbtn=(Button) findViewById(R.id.button2);
        salesbtn=(Button) findViewById(R.id.button3);
        goodsbtn=(Button) findViewById(R.id.button4);

        customerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("toast","고객 관리");
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
        salesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("toast","매출 관리");
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
        goodsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("toast","상품 관리");
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}