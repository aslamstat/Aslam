package com.example.laptoppoint.gh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
private  Button bt7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        bt7=(Button)findViewById(R.id.nasira);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent op=new Intent(Main3Activity.this,Main7Activity.class);
                startActivity(op);
            }
        });
    }
}
