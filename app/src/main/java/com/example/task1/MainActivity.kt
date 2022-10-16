package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var et_name : EditText
    lateinit var btn_mad : ImageButton
    lateinit var btn_sad : ImageButton
    lateinit var btn_happy : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_name = findViewById(R.id.et_name)
        btn_mad = findViewById(R.id.btn_mad)
        btn_sad = findViewById(R.id.btn_sad)
        btn_happy = findViewById(R.id.btn_happy)

        btn_mad.setOnClickListener {
            if (et_name.text.isEmpty()) {
                Toast.makeText(
                    applicationContext, "Please input your name first",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(
                this, "Hi " +et_name.text+ " you are mad today",
                Toast.LENGTH_SHORT
            ).show()
        }
        btn_sad.setOnClickListener {
            if (et_name.text.isEmpty()) {
                Toast.makeText(
                    applicationContext, "Please input your name first",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(
                this, "Hi " +et_name.text+ " you are sad today",
                Toast.LENGTH_SHORT
            ).show()
        }
        btn_happy.setOnClickListener {
            if (et_name.text.isEmpty()) {
                Toast.makeText(
                    applicationContext, "Please input your name first",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(
                this, "Hi " +et_name.text+ " you are happy today",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}