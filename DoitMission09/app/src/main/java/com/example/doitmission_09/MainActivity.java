package com.example.doitmission_09;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 추가할 fragment 생성
        CustomFragment fragment = new CustomFragment();
        // 프래그먼트 매니저 선언
        FragmentManager fragmentManager = getSupportFragmentManager();
        // 프래그먼트 트랜잭션 시작
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.frame, fragment); // 삽입할 위치, 삽입할 fragment
        fragmentTransaction.commit(); // 트랜잭션 종료
    }
}