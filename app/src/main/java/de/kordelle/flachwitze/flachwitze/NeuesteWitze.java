package de.kordelle.flachwitze.flachwitze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class NeuesteWitze extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neueste_witze);
        WebView nww= (WebView) findViewById(R.id.nww);

        nww.loadUrl("http://flachwitze.kordelle.de/alle-witze");
    }
}
