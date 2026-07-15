package com.example.newsapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerButton = findViewById<Button>(R.id.btnRegister)

        registerButton.setOnClickListener {
            Toast.makeText(this, "✅ ثبت‌نام شما با موفقیت انجام شد!", Toast.LENGTH_LONG).show()
        }
    }
}
