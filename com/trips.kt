package com.example.bakalaura_darbs

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.trips.*

class trips : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trips)
        fragmentupcoming.setOnClickListener{
            switchfragment(1)
        }
        fragmentpast.setOnClickListener{
            switchfragment(2)
        }
        switchfragment(1 )


        val addtrip: Button = findViewById (R.id.addtrip)

        addtrip.setOnClickListener {
            val intent = Intent(this, addingtrips::class.java)
            startActivity(intent)
        }

        val editcelojums: Button = findViewById (R.id.editcelojums)

        editcelojums.setOnClickListener {
            val intent = Intent(this, celojumaedit::class.java)
            startActivity(intent)
        }

    }

    private fun switchfragment(intWitch: Int){
        var fragment: Fragment? = null;

        when(intWitch){
            1 ->{
                fragment = Fragment_first();
            }
            2 ->{
                fragment = Fragment_second();
            }
        }
        fragment = Fragment_first();

        val args = Bundle();
        args.putString("data","")

        fragment!!.arguments = args
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flFragment, fragment);
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }


}