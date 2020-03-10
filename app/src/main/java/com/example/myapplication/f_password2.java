package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class f_password2 extends AppCompatActivity {

    Button button;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        button = findViewById(R.id.f_password2_enter_btn);
        imageButton = findViewById(R.id.f_password2_back_btn);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(f_password2.this, "修改密碼成功！", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(f_password2.this, home.class);
                startActivity(intent);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(f_password2.this, f_password1.class);
                startActivity(intent);
            }
        });
    }
}
