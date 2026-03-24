package com.example.imad_ass1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//viewCompat
        // Code goes here vvv
        //Declaration
        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        val edtTime = findViewById<EditText>(R.id.edtTime)
        val btnEnter = findViewById<Button>(R.id.btnEnter)
        val btnReset = findViewById<Button>(R.id.btnReset)
    }
}