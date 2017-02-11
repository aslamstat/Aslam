package com.example.laptoppoint.gh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    private Button bt12;
    private Button bt13;
    private Button bt14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        bt12=(Button)findViewById(R.id.me);
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent os=new Intent(Main4Activity.this,Main10Activity.class);
                startActivity(os);
            }
        });
        bt13=(Button)findViewById(R.id.lt);
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent os = new Intent(Main4Activity.this, Main2Activity.class);
                startActivity(os);
            }
        });
    }
}
