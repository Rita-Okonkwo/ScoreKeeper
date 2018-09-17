package com.example.rita.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int addScore = 0;
    int addScore1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Create onClick method for first button
    public void button(View view){
        addScore += 3;
        displayDakvilleScore(addScore);
    }
//Onclick method for second button
    public void button1(View view) {
        addScore += 2;
        displayDakvilleScore(addScore);
    }
//onClick method for third button
    public void button2(View view) {
        addScore += 1;
        displayDakvilleScore(addScore);
    }
 //Onclick method for fourth button
    public void button3(View view) {
        addScore1 += 3;
        displayBasketballScore(addScore1);
    }
//onClick method for fifth button
    public void button4(View view) {
        addScore1 += 2;
        displayBasketballScore(addScore1);
    }
//onClick method for sixth button
    public void button5(View view) {
        addScore1 += 1;
        displayBasketballScore(addScore1);
    }
 //Displays score for first team
    public void displayDakvilleScore(int value) {
        TextView textview1 = (TextView) findViewById(R.id.dakville);
        textview1.setText("" + value);
    }
// Displays score for second team
    public void displayBasketballScore(int value) {
        TextView textview2 = (TextView) findViewById(R.id.basketball);
        textview2.setText("" + value);
    }
//Resets score
    public void resetScore(View view) {
        addScore = 0;
        addScore1 = 0;
        displayDakvilleScore(addScore);
        displayBasketballScore(addScore1);
    }
}

