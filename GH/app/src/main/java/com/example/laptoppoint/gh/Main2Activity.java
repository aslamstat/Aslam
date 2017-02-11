package com.example.laptoppoint.gh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
private Button bt2;

    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt2=(Button)findViewById(R.id.raju);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent op=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(op);
            }
        });

        bt4=(Button)findViewById(R.id.dcsa);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent op=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(op);
            }
        });
        bt5=(Button)findViewById(R.id.nasira);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent op=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(op);
            }
        });
        bt6=(Button)findViewById(R.id.han);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent op=new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(op);
            }
        });
        bt7=(Button)findViewById(R.id.stat);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent op=new Intent(Main2Activity.this,Main6Activity.class);
                startActivity(op);
            }
        });
    }
}
