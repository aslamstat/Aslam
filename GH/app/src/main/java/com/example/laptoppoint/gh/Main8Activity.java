package com.example.laptoppoint.gh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity {
private  Button bt7;
    private  Button bt8;
    private  Button bt9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        bt7 = (Button) findViewById(R.id.lt);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent op = new Intent(Main8Activity.this, Main7Activity.class);
                startActivity(op);
            }
        });
        bt8 = (Button) findViewById(R.id.dcsa);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent op = new Intent(Main8Activity.this, Main9Activity.class);
                startActivity(op);
            }
        });
        bt9 = (Button) findViewById(R.id.thanha);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent op = new Intent(Main8Activity.this, Main2Activity.class);
                startActivity(op);
            }
        });
    }
}
