package com.example.and_design_assignment_newsreader

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_images.view.*

class ImageAdapter(val images: List<ImageData>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_images, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val image = images[position]
        val mContext = holder.view.context

        holder.view.textViewTitle.text = image.title

        holder.view.setOnClickListener {
            val intent = Intent(mContext, DetailsActivity::class.java)
            mContext.startActivity(intent)
        }
    }

    class ImageViewHolder(val view: View): RecyclerView.ViewHolder(view)
}