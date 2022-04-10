package com.example.project5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout= new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout, params);

        TextView textView= new TextView(this);
        textView.setText("2020039062 김민주");
        baseLayout.addView(textView);

        EditText editText= new EditText(this);
        baseLayout.addView(editText);

        Button btn= new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn);

        TextView newTextView= new TextView(this);
        newTextView.setTextColor(Color.MAGENTA);
        baseLayout.addView(newTextView);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                newTextView.setText(editText.getText());
            }
        });
    }
}