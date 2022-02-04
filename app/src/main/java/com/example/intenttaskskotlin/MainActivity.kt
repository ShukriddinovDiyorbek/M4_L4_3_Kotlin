package com.example.intenttaskskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.intenttaskskotlin.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
    }

    private fun initviews() {
        val name = findViewById<EditText>(R.id.name)
        val age = findViewById<EditText>(R.id.age)

        val button = findViewById<Button>(R.id.send_btn)

        button.setOnClickListener {
            if (name.text.length == 0 || age.text.length == 0) {
                Toast.makeText(applicationContext, "To'liq to'ldiring", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(applicationContext, SecondActivity::class.java)
                val user = User(name.text.toString(), age.text.toString())
                intent.putExtra("user", user)
                startActivity(intent)
            }
        }
    }
}