package com.example.project3_and101

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.textView)
        button.setOnClickListener {
                Log.d("BUTTONS", "User tapped the Supabutton")
                if (!button.text.equals("Recent Searches"))
                    button.setText("Recent Searches")
                else
                    button.setText("Trending Searches")
            }


    }
}