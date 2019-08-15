package com.example.redingnewsmaterialui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list.*
import kotlinx.android.synthetic.main.image_view_layout.*


class List : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        image_view.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            startActivity(intent)
        }
        image_view1.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            startActivity(intent)
        }
        image_view2.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            startActivity(intent)
        }
        image_view4.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            startActivity(intent)
        }
        image_view3.setOnClickListener {
            val intent = Intent(this, Detail::class.java)
            startActivity(intent)
        }

    }
}