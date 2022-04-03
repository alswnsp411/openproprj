package com.example.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button exitbtn, setbtn;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.obsicon);

        text1=(TextView)findViewById(R.id.Text1);
        chkAgree= (Switch) findViewById(R.id.ChkAgree);

        text2=(TextView) findViewById(R.id.Text2);
        rGroup1=(RadioGroup) findViewById(R.id.Rgroup1);
        rdoDog=(RadioButton) findViewById(R.id.RdoDog);
        rdoCat=(RadioButton) findViewById(R.id.RdoCat);
        rdoRabbit=(RadioButton) findViewById(R.id.RdoRabbit);

        imgPet=(ImageView) findViewById(R.id.ImgPet);
        exitbtn=(Button)findViewById(R.id.exitbtn);
        setbtn=(Button)findViewById(R.id.setbtn);

        chkAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chkAgree.isChecked()){  //스위치 버튼이 체크 되었는지 여부
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                    exitbtn.setVisibility(View.VISIBLE);
                    setbtn.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                    exitbtn.setVisibility(View.INVISIBLE);
                    setbtn.setVisibility(View.INVISIBLE);
                }
            }
        });

        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (rGroup1.getCheckedRadioButtonId()) {
                    case R.id.RdoCat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.RdoRabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        imgPet.setImageResource(R.drawable.dung);
                }
            }
        });
        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        setbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}