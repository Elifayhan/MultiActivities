package com.elifayhan.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String userName;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= findViewById(R.id.editText);
    }

    public void changeActivity(View view){
        userName=editText.getText().toString();
        //diğer ekrana geçiş yapabilmek için Intent i kullanırız.
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        //contextimizi verdik ve gitmek istediğimiz classı verdik.
        intent.putExtra("userInput",userName);
        startActivity(intent); //başlatıyoruz.

    }
}