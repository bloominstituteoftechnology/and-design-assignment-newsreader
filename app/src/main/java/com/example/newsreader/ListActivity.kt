package com.example.newsreader

import android.content.Intent
import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_list.*
import kotlinx.android.synthetic.main.activity_list.view.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        image_top.setOnClickListener {
            startDetailsActivity(R.drawable.hongkongprotests_07012019_1)
        }
        image_1.setOnClickListener {
            startDetailsActivity(R.drawable.firstdayofschool)
        }
        image_2.setOnClickListener {
            startDetailsActivity(R.drawable.skidhorseshow)
        }
        image_3.setOnClickListener {
            startDetailsActivity(R.drawable.brucespringsteen)
        }
        image_4.setOnClickListener {
            startDetailsActivity(R.drawable.imageoftheday)
        }

    }
    fun startDetailsActivity(image:Int){
        val intent= Intent(this,DetailsActivity::class.java)
        intent.putExtra("image",image)
        startActivity(intent)
    }

}
