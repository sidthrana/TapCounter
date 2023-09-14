package com.example.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.addButton)
        val button2 = findViewById<Button>(R.id.addTwo)
        val textView = findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            // Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++
            textView.text = counter.toString()
            if(counter>100) {
                button2.visibility = View.VISIBLE
                button.visibility = View.INVISIBLE
            }
        }
        button2.setOnClickListener {
            // Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter+=2
            textView.text = counter.toString()
        }


    }
}