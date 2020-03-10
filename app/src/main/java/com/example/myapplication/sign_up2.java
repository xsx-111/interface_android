package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class sign_up2 extends AppCompatActivity {


    Button button1, button2;
    TextView textView;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button1 = findViewById(R.id.veri_send_btn);
        button2 = findViewById(R.id.sign_up2_enter_btn);
        textView = findViewById(R.id.veri_warn);
        imageButton = findViewById(R.id.sign_up2_back_btn);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView.setText("驗證碼已寄送至信箱！");
                button1.setText("點此重新寄送");
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(sign_up2.this, "註冊成功！", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(sign_up2.this, home.class);
                startActivity(intent);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(sign_up2.this, sign_up1.class);
                startActivity(intent);
            }
        });
    }
}
