package com.example.bakalaura_darbs

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class kemerutirelis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kemerutirelis)


        val kemerutirelismaps: Button = findViewById(R.id.kemerutirelismaps)

        kemerutirelismaps.setOnClickListener {
            val gmmIntentUri =
                Uri.parse("geo:56.912263, 23.4592915")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }


        val button: Button = findViewById<Button>(R.id.btnback)

        button.setOnClickListener {
            val Bintent = Intent(this, Galvena_lapa::class.java)
            startActivity(Bintent)
        }

        val navigatekemerutirelis: Button = findViewById<Button>(R.id.navigatekemerutirelis)

        navigatekemerutirelis.setOnClickListener {
            val Bintent = Intent(this, com.example.bakalaura_darbs.navigatekemerutirelis::class.java)
            startActivity(Bintent)
        }
    }
}