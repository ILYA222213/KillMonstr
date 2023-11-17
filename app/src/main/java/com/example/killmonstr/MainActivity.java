package com.example.killmonstr;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer zombieSound;
    private Integer counter = 0;
    private Integer counterbutton=1;
    TextView mTimerText;
    CountDownTimer timer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_tap;
        button_tap = findViewById(R.id.button9);

        zombieSound = MediaPlayer.create(this, R.raw.hit);

        button_tap.setOnClickListener(v -> soundPlayButton(zombieSound));

        mTimerText = findViewById(R.id.textView4);

        if (counter <100){
            findViewById(R.id.button5).setEnabled(false);
        }
        if (counter < 180){
            findViewById(R.id.button4).setEnabled(false);
        }
        if (counter < 250){
            findViewById(R.id.button6).setEnabled(false);
        }
        if (counter < 350){
            findViewById(R.id.button2).setEnabled(false);
        }
        if (counter < 440){
            findViewById(R.id.button3).setEnabled(false);
        }
        if (counter < 500){
            findViewById(R.id.button7).setEnabled(false);
        }




        timer = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long l) {
                mTimerText.setText("" + l / 1000);
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
    public void onClickBtnAddDex(View view) {
        counter = counter + counterbutton; // Увеличение значения счетчика на значение кнопки
        TextView counterView = findViewById(R.id.scoreView);
        counterView.setText(counter.toString());
        if (counter < 100) {
            findViewById(R.id.button5).setEnabled(false);
        } else {
            findViewById(R.id.button5).setEnabled(true);
        }
        if (counter < 180) {
            findViewById(R.id.button4).setEnabled(false);
        } else {
            findViewById(R.id.button4).setEnabled(true);
        }
        if (counter < 250) {
            findViewById(R.id.button6).setEnabled(false);
        } else {
            findViewById(R.id.button6).setEnabled(true);
        }
        if (counter < 350) {
            findViewById(R.id.button2).setEnabled(false);
        } else {
            findViewById(R.id.button2).setEnabled(true);
        }
        if (counter < 440) {
            findViewById(R.id.button3).setEnabled(false);
        } else {
            findViewById(R.id.button3).setEnabled(true);
        }
        if (counter < 500) {
            findViewById(R.id.button7).setEnabled(false);
        } else {
            findViewById(R.id.button7).setEnabled(true);
        }
    }

    public void onClickBtn2AddDex(View view) {
        counter = counter - 100; // Уменьшение значения счетчика на 10
        counterbutton =+5; // Увеличение значения кнопки на 5
        TextView counterView = findViewById(R.id.scoreView);
        counterView.setText(counter.toString());
        if (counter < 100) {
            findViewById(R.id.button5).setEnabled(false); // Выключение кнопки, если значение счетчика меньше 10
        }
    }

    public void onClickBtn4AddDex(View view) {
        counter = counter - 250; // Уменьшение значения счетчика на 10
        counterbutton =+15; // Увеличение значения кнопки на 5
        TextView counterView = findViewById(R.id.scoreView);
        counterView.setText(counter.toString());
        if (counter < 250) {
            findViewById(R.id.button6).setEnabled(false); // Выключение кнопки, если значение счетчика меньше 10
        }
    }
    public void onClickBtn5AddDex(View view) {
        counter = counter - 350; // Уменьшение значения счетчика на 10
        counterbutton =+20; // Увеличение значения кнопки на 5
        TextView counterView = findViewById(R.id.scoreView);
        counterView.setText(counter.toString());
        if (counter < 350) {
            findViewById(R.id.button2).setEnabled(false); // Выключение кнопки, если значение счетчика меньше 10
        }
    }
    public void onClickBtn6AddDex(View view) {
        counter = counter - 440; // Уменьшение значения счетчика на 10
        counterbutton =+25; // Увеличение значения кнопки на 5
        TextView counterView = findViewById(R.id.scoreView);
        counterView.setText(counter.toString());
        if (counter < 440) {
            findViewById(R.id.button3).setEnabled(false); // Выключение кнопки, если значение счетчика меньше 10
        }
    }
    public void onClickBtn7AddDex(View view) {
        counter = counter - 500; // Уменьшение значения счетчика на 10
        counterbutton =+30; // Увеличение значения кнопки на 5
        TextView counterView = findViewById(R.id.scoreView);
        counterView.setText(counter.toString());
        if (counter < 500) {
            findViewById(R.id.button7).setEnabled(false); // Выключение кнопки, если значение счетчика меньше 10
        }
    }


    public void nClickBtn3AddDex(View view) {
        counter = counter - 180; // Уменьшение значения счетчика на 10
        counterbutton =+10; // Увеличение значения кнопки на 5
        TextView counterView = findViewById(R.id.scoreView);
        counterView.setText(counter.toString());
        if (counter < 180) {
            findViewById(R.id.button4).setEnabled(false); // Выключение кнопки, если значение счетчика меньше 10
        }
    }
}