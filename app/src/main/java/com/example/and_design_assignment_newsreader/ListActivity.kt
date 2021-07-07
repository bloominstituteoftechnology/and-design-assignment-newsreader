package com.example.and_design_assignment_newsreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val images = listOf(
            ImageData(1, "", "I Like purple"),
            ImageData(1, "", "I Like purple"),
            ImageData(1, "", "I Like purple"),
            ImageData(1, "", "I Like purple"),
            ImageData(1, "", "I Like purple"),
            ImageData(1, "", "I Like purple"),
            ImageData(1, "", "I Like purple"),
            ImageData(1, "", "I Like purple"),
            ImageData(1, "", "I Like purple"),
            ImageData(1, "", "I Like purple")


        )

        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.adapter = ImageAdapter(images)
    }
}
