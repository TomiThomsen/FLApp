package de.kordelle.flachwitze.flachwitze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Entwickler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entwickler);

        Button bbtom= (Button)findViewById(R.id.bbtom);
        bbtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), btom.class));
            }
        });

        Button bberik= (Button)findViewById(R.id.bberik);
        bberik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), berik.class));
            }
        });
    }
}
