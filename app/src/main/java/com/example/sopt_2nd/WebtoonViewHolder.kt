package com.example.sopt_2nd

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class WebtoonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tv_title = itemView.findViewById<TextView>(R.id.tv_title)
    val tv_grade = itemView.findViewById<TextView>(R.id.tv_grade)
    val tv_writer = itemView.findViewById<TextView>(R.id.tv_writer)
    val img_contents = itemView.findViewById<ImageView>(R.id.img_contents)

    fun bind(webtoonData: WebtoonData) {
        tv_title.text = webtoonData.title
        tv_grade.text = webtoonData.grade
        tv_writer.text = webtoonData.writer
        Glide.with(itemView).load(webtoonData.img_contents).into(img_contents)

    }
}