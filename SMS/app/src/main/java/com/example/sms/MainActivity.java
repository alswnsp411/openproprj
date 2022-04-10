package com.example.sms;

import android.os.Bundle;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edittextbox;
    TextView textlength;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittextbox= (EditText) findViewById(R.id.editTextBox);
        textlength=(TextView)findViewById(R.id.textLength);
        edittextbox.addTextChangedListener(new android.text.TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                int length= editable.toString().length();
                textlength.setText(length+" / 80 바이트");
            }
        });

        send= (Button) findViewById(R.id.send);
        send.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Toast.makeText(MainActivity.this, edittextbox.getText(),Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}