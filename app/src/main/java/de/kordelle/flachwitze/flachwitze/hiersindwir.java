package de.kordelle.flachwitze.flachwitze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class hiersindwir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiersindwir);

        WebView hswew= (WebView) findViewById(R.id.hswew);

        hswew.loadUrl("http://flachwitze.kordelle.de/sample-page");
    }
}
