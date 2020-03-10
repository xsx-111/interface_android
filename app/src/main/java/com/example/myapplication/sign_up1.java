package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class sign_up1 extends AppCompatActivity {

    ImageButton imageButton1, imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        imageButton1 = findViewById(R.id.button_next);
        imageButton2 = findViewById(R.id.sign_up1_back_btn);

        imageButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(sign_up1.this, sign_up2.class);
                startActivity(intent);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(sign_up1.this, home.class);
                startActivity(intent);
            }
        });
    }
}
