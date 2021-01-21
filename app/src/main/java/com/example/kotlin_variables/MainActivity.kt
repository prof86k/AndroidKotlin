package com.example.kotlin_variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("  seperator","============================================================\n")
        Log.d(" Song Attributes","Printing song attributes to console.")
        Log.d(" Song Title", songTitle)
        Log.d(" Song Duration",duration.toString())
        Log.d(" Year of Release", yearofRelease.toString())
        Log.d(" Artist", artist)
        Log.d(" Genre", genre)
        Log.d(" Album", album)
        Log.d("  ender ","-----------------------------------------------------------------\n")
    }
}