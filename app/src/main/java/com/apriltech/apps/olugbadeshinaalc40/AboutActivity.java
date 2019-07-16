package com.apriltech.apps.olugbadeshinaalc40;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    String weburl = "https://www.andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView aboutWebView = (WebView) findViewById(R.id.wbv_about);
        aboutWebView.setWebViewClient(new MyWebView());
        aboutWebView.getSettings().setJavaScriptEnabled(true);
        aboutWebView.getSettings().setLoadsImagesAutomatically(true);
        aboutWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        aboutWebView.loadUrl(weburl);
    }

    class MyWebView extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap icon) {
            // TODO Auto-generated method
            super.onPageStarted(view, url, icon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub

            if (Uri.parse(url).getHost().equals(weburl))
                return false;

            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

            startActivity(webIntent);
            return true;

        }


    }

}
