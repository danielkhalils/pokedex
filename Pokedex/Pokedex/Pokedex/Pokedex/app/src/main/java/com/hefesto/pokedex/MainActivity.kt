package com.hefesto.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  // OnCreate inicia uma activity //
        setContentView(R.layout.activity_main)
    }
}

