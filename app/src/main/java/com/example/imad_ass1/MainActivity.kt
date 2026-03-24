package com.example.imad_ass1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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

var Time : String
        var Morning : String
        var Mid_morning : String
        var Afternoon : String
        var Afternoon_Snack : String
        var Dinner : String
        var Night : String


        btnEnter.setOnClickListener {
            Morning = edtTime.text.toString()
            Mid_morning = edtTime.text.toString()
            Afternoon = edtTime.text.toString()
            Afternoon_Snack = edtTime.text.toString()
            Dinner = edtTime.text.toString()
            Night = edtTime.text.toString()
            Time = edtTime.text.toString()

            //  If Statements
            if (Time == "Morning"){
                tvTitle.text = " Send a good morning text to a family member"

            } else if (Time == "Mid_morning")
                tvTitle.text = "Reach out to a colleague with a quick 'Thank you'"

            else if (Time == "Afternoon")
                tvTitle.text = "Share a funny meme or interesting link with a friend"

            else if (Time == "Afternoon_Snack")
                tvTitle.text = "Send a quick 'thinking of you' message"

            else if (Time == "Dinner")
                tvTitle.text = "Call a friend or relative for a 5 minute catch-up"

            else if (Time == "Night")
                tvTitle.text = "Leave a thoughtful comment on a friend's post"

            else{
                Toast.makeText(
                    this, " Please enter valid information",
                    Toast.LENGTH_SHORT

                ).show()
            }

        }

        btnReset.setOnClickListener {

            // clear all input fields
            edtTime.text.clear()
            tvTitle.text="Social Sparks"
        }
    }
}