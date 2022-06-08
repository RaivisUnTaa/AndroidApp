package com.example.bakalaura_darbs

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class karaosta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.karaosta)

        val karaostamaps: Button = findViewById(R.id.karaostamaps)

        karaostamaps.setOnClickListener {
            val gmmIntentUri =
                Uri.parse("geo:56.5499978, 21.00333332")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }


        val button: Button = findViewById<Button>(R.id.karaostaback)

        button.setOnClickListener {
            val Bintent = Intent(this, Galvena_lapa::class.java)
            startActivity(Bintent)
        }

        val navigatekaraosta: Button = findViewById<Button>(R.id.navigatekaraosta)

        navigatekaraosta.setOnClickListener {
            val Bintent = Intent(this, com.example.bakalaura_darbs.navigatekaraosta::class.java)
            startActivity(Bintent)
        }
    }
}