package com.example.myprogramm

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TextViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val textView: TextView = itemView.findViewById(R.id.randomText)
    fun bind(country: String) {
        textView.text = country
    }



}