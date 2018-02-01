package com.rajkavuru.dicee;

import android.media.Image;
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

        Button rollButton ;
        rollButton = findViewById(R.id.rollbutton);
        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        final int[] diceArray = {R.drawable.dice1,
                           R.drawable.dice2,
                           R.drawable.dice3,
                           R.drawable.dice4,
                           R.drawable.dice5,
                           R.drawable.dice6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "Button pressed!");
                Random randomNumberGen = new Random();
                int number = randomNumberGen.nextInt(6);
                Log.d("Dicee", "random 1:"+number);
                leftDice.setImageResource(diceArray[number]);
                number = randomNumberGen.nextInt(6);
                Log.d("Dicee", "random 2:"+number);
                rightDice.setImageResource(diceArray[number]);

            }
        });

    }
}
