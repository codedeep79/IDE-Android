package com.example.ide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button btnLogin, btnRecognition;
    Intent intentLogin, intentRecognition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getID();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentLogin = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intentLogin);
            }
        });
        btnRecognition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentRecognition = new Intent(MainActivity.this, RecognitionText.class);
                startActivity(intentRecognition);
            }
        });
    }
    protected void getID(){
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRecognition = (Button) findViewById(R.id.btnRecognition);
    }
}
