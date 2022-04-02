package com.example.appstepik

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class SecondActivity:Activity() { // после создания наследника надо передать класс в манифест

    private lateinit var mHelloTextView:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        mHelloTextView = findViewById(R.id.act2_edittext)
        val imagebutton = findViewById<ImageButton>(R.id.act2_imagebutton)
        imagebutton.setOnClickListener {
            mHelloTextView.setText("Hello Kity!")
        }

        val linkButtonact2 = findViewById<Button>(R.id.act2_button)
        linkButtonact2.setOnClickListener {
            finish()
        }

    }
}