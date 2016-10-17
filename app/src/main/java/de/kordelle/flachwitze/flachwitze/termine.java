package de.kordelle.flachwitze.flachwitze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class termine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termine);

        WebView wt= (WebView) findViewById(R.id.wt);

        wt.loadUrl("http://flachwitze.kordelle.de/termine");
    }
}
