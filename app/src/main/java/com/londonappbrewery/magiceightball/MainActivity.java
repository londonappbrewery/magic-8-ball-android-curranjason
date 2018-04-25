package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        askButton = findViewById(R.id.runbutton);

        final int[] answerArray = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        final ImageView answers = (ImageView) findViewById(R.id.image_answer);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random generateRandomNumber = new Random();
                int randomNub = generateRandomNumber.nextInt(5);

                answers.setImageResource(answerArray[randomNub]);

                Log.d("8ball", "this is the random int "+randomNub);

            }
        });



    }
}
