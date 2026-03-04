package com.example.diceroller

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice1Image = findViewById<ImageView>(R.id.dice1)
        val dice2Image = findViewById<ImageView>(R.id.dice2)
        val resultText = findViewById<TextView>(R.id.resultText)
        val rollButton = findViewById<Button>(R.id.rollButton)

        val diceSound = MediaPlayer.create(this, R.raw.dice_roll)

        val diceImages = arrayOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6
        )

        rollButton.setOnClickListener {

            // play dice sound
            diceSound.start()

            val dice1 = (1..6).random()
            val dice2 = (1..6).random()

            dice1Image.setImageResource(diceImages[dice1 - 1])
            dice2Image.setImageResource(diceImages[dice2 - 1])

            val comment = when (Pair(dice1, dice2)) {

                Pair(1,1) -> "Snake eyes! Very unlucky!"
                Pair(1,2) -> "A slow start!"
                Pair(1,3) -> "Still warming up!"
                Pair(1,4) -> "A lucky rescue roll!"
                Pair(1,5) -> "Climbing the ladder!"
                Pair(1,6) -> "From worst to best!"

                Pair(2,1) -> "Reversed luck!"
                Pair(2,2) -> "Twin twos!"
                Pair(2,3) -> "A steady roll!"
                Pair(2,4) -> "Nice improvement!"
                Pair(2,5) -> "Good momentum!"
                Pair(2,6) -> "Strong roll!"

                Pair(3,1) -> "A tricky combination!"
                Pair(3,2) -> "Getting interesting!"
                Pair(3,3) -> "Double three magic!"
                Pair(3,4) -> "Balanced roll!"
                Pair(3,5) -> "Good progress!"
                Pair(3,6) -> "Power play!"

                Pair(4,1) -> "Unexpected comeback!"
                Pair(4,2) -> "Steady climb!"
                Pair(4,3) -> "Smooth roll!"
                Pair(4,4) -> "Double fours! Solid!"
                Pair(4,5) -> "Great combination!"
                Pair(4,6) -> "High numbers rolling!"

                Pair(5,1) -> "Turning the tide!"
                Pair(5,2) -> "Nice effort!"
                Pair(5,3) -> "Lucky momentum!"
                Pair(5,4) -> "Strong combo!"
                Pair(5,5) -> "Double fives! Jackpot!"
                Pair(5,6) -> "Almost perfect!"

                Pair(6,1) -> "Lucky reversal!"
                Pair(6,2) -> "Big start!"
                Pair(6,3) -> "Power combo!"
                Pair(6,4) -> "Winning roll!"
                Pair(6,5) -> "So close to greatness!"
                Pair(6,6) -> "🎉 Double six! Ultimate roll!"

                else -> "Roll again!"
            }

            resultText.text = comment
        }
    }
}