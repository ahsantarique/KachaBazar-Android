package com.biborton.kachabazarandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

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
        wvHomePage.setWebViewClient(new CustomWebViewClient());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && wvHomePage.canGoBack()) {
            wvHomePage.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class CustomWebViewClient extends WebViewClient{

    }
}
