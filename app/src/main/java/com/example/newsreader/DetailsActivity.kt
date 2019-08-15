package com.example.newsreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
       val image:Int= intent.getIntExtra("image",R.drawable.hongkongprotests_07012019_1)
        image_details.setImageDrawable(ContextCompat.getDrawable(this, image))
    }
}
