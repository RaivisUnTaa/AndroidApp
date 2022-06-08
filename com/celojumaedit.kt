package com.example.bakalaura_darbs

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class celojumaedit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.celojumaedit)

        val addaction: Button = findViewById (R.id.addaction)

        addaction.setOnClickListener {
            val intent = Intent(this, com.example.bakalaura_darbs.addaction::class.java)
            startActivity(intent)
        }


        val btnback: Button = findViewById (R.id.btnback)

        btnback.setOnClickListener {
            val intent = Intent(this, trips::class.java)
            startActivity(intent)
        }

        val share: Button = findViewById (R.id.share)
        share.setOnClickListener {
            val intent= Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,"Hey Check out my travel plan:")
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share To:"))
        }

    }
}

