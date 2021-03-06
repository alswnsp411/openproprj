package com.example.project10_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setTitle("투표 결과");

        int bestChoicenum=0;

        Intent intent= getIntent();
        //넘겨 받은 투표 결과 배열과 그림 이름 배열 저장
        int[] voteResult= intent.getIntArrayExtra("VoteCount");
        String[] imageName= intent.getStringArrayExtra("ImageName");

        TextView tv[]= new TextView[imageName.length];
        RatingBar rbar[]= new RatingBar[imageName.length];

        Integer tvID[]={R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4, R.id.tv5, R.id.tv6, R.id.tv7, R.id.tv8, R.id.tv9};
        Integer rbarID[]={R.id.rbar1, R.id.rbar2, R.id.rbar3, R.id.rbar4, R.id.rbar5,R.id.rbar6,R.id.rbar7, R.id.rbar8, R.id.rbar9};

        for (int i = 0; i < voteResult.length; i++) {
            tv[i]=(TextView) findViewById(tvID[i]);
            rbar[i]=(RatingBar) findViewById(rbarID[i]);
        }

        for (int i = 0; i < voteResult.length; i++) {
            tv[i].setText(imageName[i]);
            rbar[i].setRating((float) voteResult[i]);
            if(voteResult[i]>=voteResult[bestChoicenum]){
                bestChoicenum=i;
            }
        }
        //사진 설정
        ImageView bestChoice=(ImageView) findViewById(R.id.bestChoice);
        Integer imageField[]={R.drawable.pic0,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8};
        bestChoice.setImageResource(imageField[bestChoicenum]);


        Button btnReturn =(Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}