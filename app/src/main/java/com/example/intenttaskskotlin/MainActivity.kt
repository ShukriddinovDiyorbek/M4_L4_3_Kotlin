package com.example.intenttaskskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
    }

    private fun initviews() {
        val info = findViewById<EditText>(R.id.info)
        val button = findViewById<Button>(R.id.send_btn)

        button.setOnClickListener {
            if (info.text.length == 0) {
                Toast.makeText(applicationContext, "To'liq to'ldiring", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(applicationContext, SecondActivity::class.java)
                val str = info.text.toString()
                intent.putExtra("info", str)
                startActivity(intent)
            }
        }
    }
}