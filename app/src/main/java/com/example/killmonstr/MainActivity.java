package com.example.killmonstr;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer zombieSound;
    private Integer counter = 0;
TextView mTimerText;
CountDownTimer timer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_tap;
        button_tap = findViewById(R.id.button);

        zombieSound = MediaPlayer.create(this, R.raw.hitzombie);

        button_tap.setOnClickListener(v -> soundPlayButton(zombieSound));

        mTimerText = findViewById(R.id.textView4);


        timer = new CountDownTimer(60000,1000) {
            @Override
            public void onTick(long l) {
                mTimerText.setText(""+l/1000);
            }

            @Override
            public void onFinish() {
mTimerText.setText("End");
            }
        }.start();
    }

    private void soundPlayButton(MediaPlayer sound) {
   sound.start();
    }

}
