package com.example.chat_pdf_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import com.example.chat_pdf_1.SplashActivity;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Transition to the main activity
                Intent intent = new Intent(MainActivity.this, SplashActivity.class);
                startActivity(intent);
                finish(); // Finish the splash activity to prevent going back to it
            }
        }, 5000);

        setContentView(R.layout.activity_main);

    }
}