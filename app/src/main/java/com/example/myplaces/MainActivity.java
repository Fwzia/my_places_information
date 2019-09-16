package com.example.myplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView paris = (TextView) findViewById(R.id.paris);
        paris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "Open the list of Paris places",Toast.LENGTH_LONG).show();
                Intent parisIntent = new Intent(MainActivity.this, ParisActivity.class);
                startActivity(parisIntent);
            }
        });

        TextView aswan=(TextView)findViewById(R.id.aswan);
        aswan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "Open the list of Aswan places",Toast.LENGTH_LONG).show();
                Intent aswanIntent=new Intent(MainActivity.this,AswanActivity.class);
                startActivity(aswanIntent);
            }
        });

        TextView dubai=(TextView)findViewById(R.id.dubai);
        dubai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "Open the list of Dubai places",Toast.LENGTH_LONG).show();
                Intent dubaiIntent=new Intent(MainActivity.this,DubaiActivity.class);
                startActivity(dubaiIntent);
            }
        });
    }
}
