package com.example.project4_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit1= (EditText) findViewById(R.id.Edit1);
        EditText edit2=(EditText) findViewById(R.id.Edit2);
        TextView textresult=(TextView)findViewById(R.id.TextResult);

        Button btnadd=(Button) findViewById(R.id.BtnAdd);
        Button btnsub=(Button) findViewById(R.id.BtnSub);
        Button btnmul=(Button) findViewById(R.id.BtnMul);
        Button btndiv=(Button) findViewById(R.id.BtnDiv);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer result;
                String e1= edit1.getText().toString();
                String e2= edit2.getText().toString();

                result= Integer.parseInt(e1)+Integer.parseInt(e2);
                textresult.setText("계산 결과 : "+result.toString());
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer result;
                String e1= edit1.getText().toString();
                String e2= edit2.getText().toString();

                result= Integer.parseInt(e1)-Integer.parseInt(e2);
                textresult.setText("계산 결과 : "+result.toString());
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer result;
                String e1= edit1.getText().toString();
                String e2= edit2.getText().toString();

                result= Integer.parseInt(e1)*Integer.parseInt(e2);
                textresult.setText("계산 결과 : "+result.toString());
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer result;
                String e1= edit1.getText().toString();
                String e2= edit2.getText().toString();

                result= Integer.parseInt(e1)/Integer.parseInt(e2);
                textresult.setText("계산 결과 : "+result.toString());
            }
        });
    }
}