package com.example.project6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtUrl;
    Button btnGo, btnBack;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUrl=(EditText) findViewById(R.id.edtUrl);
        btnGo=(Button) findViewById(R.id.btnGo);
        btnBack=(Button) findViewById(R.id.btnBack);

        web=(WebView) findViewById(R.id.webView1);

        //생성한 CookWebViewClient 클래스를 웹뷰에 설정
        web.setWebViewClient(new CookWebViewClient());

        WebSettings webSet= web.getSettings();
        webSet.setBuiltInZoomControls(true);  //화면 확대/축소 아이콘이 보이도록 설정
        webSet.setJavaScriptEnabled(true);  //자바스크립트 사용할 수 있음
        btnGo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                web.loadUrl(edtUrl.getText().toString());
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                web.goBack();
            }
        });
    }

    class CookWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}