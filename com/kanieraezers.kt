package com.example.bakalaura_darbs

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class kanieraezers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.popularkanieraezers)


        val kaneiraezersview: Button = findViewById(R.id.kaneiraezersview)

        kaneiraezersview.setOnClickListener {
            val gmmIntentUri =
                Uri.parse("geo:56.951667, 23.5125")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }


        val button: Button = findViewById<Button>(R.id.button_back)

        button.setOnClickListener {
            val Bintent = Intent(this, Galvena_lapa::class.java)
            startActivity(Bintent)
        }

        val navigatekaneiraezers: Button = findViewById<Button>(R.id.navigatekaneiraezers)

        navigatekaneiraezers.setOnClickListener {
            val Bintent = Intent(this, com.example.bakalaura_darbs.navigatekaneiraezers::class.java)
            startActivity(Bintent)
        }
    }
}


