package de.kordelle.flachwitze.flachwitze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Handy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handy);

        Button awb = (Button) findViewById(R.id.awb);
        awb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), NeuesteWitze.class));

            }
        });

        Button ewb = (Button) findViewById(R.id.ewb);
        ewb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Entwickler.class));

            }
        });

        Button tb = (Button) findViewById(R.id.tb);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), termine.class));

            }
        });

        Button mrb = (Button) findViewById(R.id.mrb);
        mrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), mainpage2.class));

            }
        });

        Button hsweb = (Button) findViewById(R.id.hsweb);
        hsweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), hiersindwir.class));

            }
        });

        Button ueb = (Button) findViewById(R.id.ueb);
        ueb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), ueber.class));

            }
        });

    }
}
