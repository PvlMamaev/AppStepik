package com.example.appstepik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // конструктор родительского класса, выполняющий необходимые операции для работы активности
        setContentView(R.layout.activity_main)
    }
}