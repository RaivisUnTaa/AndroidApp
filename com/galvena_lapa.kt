package com.example.bakalaura_darbs

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity



class Galvena_lapa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.galvena_lapa)



        val kanieraezers = findViewById<ImageView>(R.id.kanieraezers)
        kanieraezers.setOnClickListener {
            val intent = Intent(this, com.example.bakalaura_darbs.kanieraezers::class.java)
            startActivity(intent)
        }

        val kemerutirelis = findViewById<ImageView>(R.id.kemerutirelis)
        kemerutirelis.setOnClickListener {
            val intent = Intent(this, com.example.bakalaura_darbs.kemerutirelis::class.java)
            startActivity(intent)
        }

        val karaosta = findViewById<ImageView>(R.id.karaosta)
        karaosta.setOnClickListener {
            val intent = Intent(this, com.example.bakalaura_darbs.karaosta::class.java)
            startActivity(intent)
        }

        val trips: Button = findViewById (R.id.trips)

        trips.setOnClickListener {
            val intent = Intent(this, com.example.bakalaura_darbs.trips::class.java)
            startActivity(intent)
        }

        val usersettings: Button = findViewById (R.id.usersettings)

        usersettings.setOnClickListener {
            val intent = Intent(this, com.example.bakalaura_darbs.usersettings::class.java)
            startActivity(intent)
        }

        val wether: Button = findViewById (R.id.weather)

        wether.setOnClickListener {
            val intent = Intent(this, com.example.bakalaura_darbs.weather::class.java)
            startActivity(intent)
        }
    }

        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            // Inflate the menu; this adds items to the action bar if it is present.
            menuInflater.inflate(R.menu.item_menu, menu)
            return true
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.weather -> {
                val intent = Intent(this, weather::class.java)
                startActivity(intent)
                true
            }
            R.id.mapsmenu -> {
                val intent = Intent(this, Galvena_lapa::class.java)
                startActivity(intent)
                return true
            }
            R.id.tripsmenu -> {
                val intent = Intent(this, trips::class.java)
                startActivity(intent)
                return true
            }
            R.id.accountmenu -> {
                val intent = Intent(this, usersettings::class.java)
                startActivity(intent)
                return true
            }
            else -> super.onOptionsItemSelected(item)


            /*val firstFragment=FirstFragment()
        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.accountmenu->setCurrentFragment(firstFragment)

            }
            true
        }*/


            /*private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }*/
        }
    }
}