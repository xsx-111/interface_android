package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class f_password1 extends AppCompatActivity {

    TextView textView;
    Button button;
    ImageButton imageButton1, imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        textView = findViewById(R.id.veri_warn);
        button = findViewById(R.id.veri_send_btn);
        imageButton1 = findViewById(R.id.f_password1_back_btn);
        imageButton2 = findViewById(R.id.button_next);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView.setText("驗證碼已寄送至信箱！");
                button.setText("點此重新寄送");
            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(f_password1.this, home.class);
                startActivity(intent);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(f_password1.this, f_password2.class);
                startActivity(intent);
            }
        });
    }
}
