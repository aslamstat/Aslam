package com.example.laptoppoint.gh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main10Activity extends AppCompatActivity {
    private Button bt12;
    private Button bt13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        bt12 = (Button) findViewById(R.id.raju);
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent os = new Intent(Main10Activity.this, Main11Activity.class);
                startActivity(os);
            }
        });

        bt13= (Button) findViewById(R.id.op);
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent os = new Intent(Main10Activity.this, Main4Activity.class);
                startActivity(os);
            }
        });
    }
}
