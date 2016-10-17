package de.kordelle.flachwitze.flachwitze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        Button nwb = (Button) findViewById(R.id.nwb);

        nwb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), NeuesteWitze.class));
            }
        });

        Button ue = (Button) findViewById(R.id.ue);
        ue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), ueber.class));

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

        Button hswe = (Button) findViewById(R.id.hswe);
        hswe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), hiersindwir.class));

            }
        });

        Button mb = (Button) findViewById(R.id.mb);
        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), mainpage2.class));

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menumain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.menu_handy){
            startActivity(new Intent (getBaseContext(),Handy.class));
        }
        return super.onOptionsItemSelected(item);
    }
}













