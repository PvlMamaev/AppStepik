package com.example.appstepik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // конструктор родительского класса, выполняющий необходимые операции для работы активности
        setContentView(R.layout.activity_main)

        val data = Array(20, {x -> "Item$x"}) // создание списка
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data) // создание адаптера
        gridView.adapter = adapter // назначение адаптера gridView

        gridView.columnWidth = 100 // задание ширины сетки
        gridView.numColumns = 10 // кол-во столбцов

        gridView.onItemClickListener // обработка
        gridView.onItemLongClickListener
        
    }
}