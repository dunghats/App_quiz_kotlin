package com.shomai.tictactoe_multiplayerofflinetictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.shomai.tictactoe_multiplayerofflinetictactoegame.R

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val start = findViewById<Button>(R.id.button)

        start.setOnClickListener{

            val start = Intent (this, MainActivity::class.java)
            startActivity(start)

        }



    }
}