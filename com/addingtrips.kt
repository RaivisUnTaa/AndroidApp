package com.example.bakalaura_darbs

import android.app.DatePickerDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.addingtrip.*
import java.text.SimpleDateFormat
import java.util.*

class addingtrips : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addingtrip)

        val btnback: Button = findViewById (R.id.btnback)

        btnback.setOnClickListener {
            val intent = Intent(this, com.example.bakalaura_darbs.trips::class.java)
            startActivity(intent)
        }

        startdate.transformIntoDatePicker(this, "MM/dd/yyyy")
        startdate.transformIntoDatePicker(this, "MM/dd/yyyy", Date())

        enddate.transformIntoDatePicker(this, "MM/dd/yyyy")
        enddate.transformIntoDatePicker(this, "MM/dd/yyyy", Date())


        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            destination, startdate, enddate,
            tripname, description

        )
        var mListView = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter
    }
    fun EditText.transformIntoDatePicker(context: Context, format: String, maxDate: Date? = null) {
        isFocusableInTouchMode = false
        isClickable = true
        isFocusable = false

        val myCalendar = Calendar.getInstance()
        val datePickerOnDataSetListener =
            DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                myCalendar.set(Calendar.YEAR, year)
                myCalendar.set(Calendar.MONTH, monthOfYear)
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                val sdf = SimpleDateFormat(format, Locale.UK)
                setText(sdf.format(myCalendar.time))
            }

        setOnClickListener {
            DatePickerDialog(
                context, datePickerOnDataSetListener, myCalendar
                    .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)
            ).run {
                maxDate?.time?.also { datePicker.maxDate = it }
                show()
            }
        }
    }
}