package com.example.myprogramm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fragment3: Fragment(R.layout.fragment_3) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_3, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(context);
        recyclerView.adapter = RandomNumListAdapter(randomCountry().toSortedSet())

        return view
    }

    fun randomCountry(): Set<String> {
        val set = mutableSetOf<String>()
        for (i in 0..100) {
            set.add("count $i")
        }
        return set
    }
}