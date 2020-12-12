package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

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

                                                                        // Variable Declarations
        Button rollButton;
        ImageView leftDice;
        ImageView rightDice;
        final int[] diceArray;
                                                                        // Variable Assignments
        rollButton = (Button) findViewById(R.id.rollButton);
        leftDice = (ImageView) findViewById(R.id.image_leftDice);
        rightDice = (ImageView) findViewById(R.id.image_rightDice);

        diceArray = new int[] {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Dicee", "Hazaaah! Ze Button has been pressed!");

//                Random randomNumberGenerator = new Random();
//
//                int number = randomNumberGenerator.nextInt(6);
//                Log.d("Dicee", "The random number is: " + number);
//
//                leftDice.setImageResource(diceArray[number]);
//
//                number = randomNumberGenerator.nextInt(6);
//                Log.d("Dicee", "The random number is: " + number);
//
//                rightDice.setImageResource(diceArray[number]);

                randomizer(leftDice, diceArray);
                randomizer(rightDice, diceArray);
            }
        });

    }
                                                                        // This function is used to randomize a dice
    public void randomizer(ImageView dice, int[] array){
                                                                        // Variable Declarations
        int number;
                                                                        // Creates a new random number generator
        Random randomNumberGenerator = new Random();
                                                                        // Assigns a random number from 1 - 6 to the "number" variable
        number = randomNumberGenerator.nextInt(6);
                                                                        // Sets the image view in the array to the randomly generated number
        dice.setImageResource(array[number]);
        Log.d("Dicee", "The random number is: " + number);

    }
}