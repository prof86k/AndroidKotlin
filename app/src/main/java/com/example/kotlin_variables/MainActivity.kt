package com.example.kotlin_variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // printing all attrs of the song to console
        Log.d("  seperator","============================================================\n")
        Log.d(" Song Attributes","Printing song attributes to console.")
        Log.d(" Song Title", songTitle)
        Log.d(" Song Duration",duration.toString())
        Log.d(" Year of Release", yearofRelease)
        Log.d(" Artist", artist)
        Log.d(" Genre", genre)
        Log.d(" Album", album)
        Log.d("Producer",producer)
        Log.d("Song Writter",songWritter)
        Log.d("Recorder",recorded)
        Log.d("  ender ","-----------------------------------------------------------------\n")
        // end of song attrs
    }
}