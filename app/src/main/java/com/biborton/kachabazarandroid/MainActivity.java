package com.biborton.kachabazarandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView wvHomePage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews(){
        wvHomePage = (WebView) findViewById(R.id.homePage);
        wvHomePage.loadUrl(URLMap.homePage);
        WebSettings webSettings = wvHomePage.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
