package com.elifayhan.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView2);
        //mainactivitydeki değeri nasıl ilk açıldığında alacağız:
        Intent intent=getIntent(); //intenti al diyoruz.
        String userName= intent.getStringExtra("userInput"); //anahtar kelime birebir aynı olmalı.
        //bir değişkene eşitledik ki bunu kullanabilelim.
        //daha sonra
        textView.setText(userName); //dersek kullanıcımızın ismi textViewda çıkar.
    }
    public void changeScreen(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}