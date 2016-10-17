package de.kordelle.flachwitze.flachwitze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView whbb= (WebView) findViewById(R.id.whbb);

        whbb.loadUrl("http://flachwitze.kordelle.de/wp-login.php?");
    }
}
