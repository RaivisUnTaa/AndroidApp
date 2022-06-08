package com.example.bakalaura_darbs

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class addaction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addaction)


        val btnback: Button = findViewById (R.id.btnback)

        btnback.setOnClickListener {
            val intent = Intent(this, celojumaedit::class.java)
            startActivity(intent)
        }

        /*val i = Intent(this, addaction::class.java)
        val textView = findViewById<View>(android.R.id.activity) as AutoCompleteTextView
        val getrec = textView.text.toString()

        val bundle = Bundle()

        bundle.putString("Activity", getrec)
        i.putExtras(bundle)
        startActivity(i)
        val bundle = intent.extras
        String stuff = bundle.getString("Activity")*/
    }


}