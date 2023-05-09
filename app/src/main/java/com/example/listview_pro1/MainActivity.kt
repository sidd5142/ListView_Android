package com.example.listview_pro1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.listView)

        val tasklist = arrayListOf<String>()
        tasklist.add("Visit CP Hanuman Mandir")
        tasklist.add("Attend Exam")
        tasklist.add("Work on Resume")
        tasklist.add("Work from Home")
        tasklist.add("Complete the app dev")
        tasklist.add("Internet")

        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, tasklist)
        listview.adapter = adapterForMyListView

        listview.setOnItemClickListener { adapterView, view, i, l ->

            val text = "Clicked on Item : " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

    }
}