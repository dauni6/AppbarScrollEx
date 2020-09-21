package com.dontsu.appbarscrollex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.search_bar.*

/**
 * 1. search_bar에서 텍스트 입력 후 하나씩 리사이클러뷰에 추가해주기
 */
class MainActivity : AppCompatActivity() {

    private var textList = arrayListOf<String>()
    private lateinit var adapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ListAdapter()
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this@MainActivity)

        addButton.setOnClickListener {
            val name = searchTab.text.toString()
            adapter.listUpdate(name)
            searchTab.text = null
        }

    }

}