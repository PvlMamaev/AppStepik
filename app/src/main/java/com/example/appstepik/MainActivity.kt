package com.example.appstepik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var linkTextact1:TextView // создаем переменную класса. lateinit - отложенная инициализация
                                        // lateinit не может быть int double итд. Мы указываем ей тип TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // конструктор родительского класса, выполняющий необходимые операции для работы активности
        setContentView(R.layout.activity_main)

        linkTextact1 = findViewById<TextView>(R.id.act1_text) // ссылка на объект (на текст)
        linkTextact1.setTextColor(0xFFFF0000.toInt()) // поменять цвет текста
        linkTextact1.setOnClickListener {
            val i=Intent(this,SecondActivity::class.java) // будь внимателен intent и Intent 2 разные вещи
            startActivity(i) // всегда все делаем TAB'ом, иначе не работает
        }
    }

    override fun onStart() { // экран виден пользователю
        super.onStart()
    }

    override fun onResume() { // эта точка говорит нам, что экран стал активен
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() { // уничтожение приложения (можно удалить закэшированные данные)
        super.onDestroy()
    }
}