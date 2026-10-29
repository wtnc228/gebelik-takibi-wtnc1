package com.ornek.gebeliktakibi;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    WebView web = new WebView(this);
    WebSettings settings = web.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(true);
    web.setBackgroundColor(0xFFFFF8FA);
    setContentView(web);
    web.loadUrl("file:///android_asset/index.html");
  }
}
