package com.example.linetest;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import static android.os.StrictMode.*;

public class RockPaperScissorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setThreadPolicy(new ThreadPolicy.Builder().permitAll().build());
        setContentView(R.layout.rockpaperscissors_activity);
    }
}
