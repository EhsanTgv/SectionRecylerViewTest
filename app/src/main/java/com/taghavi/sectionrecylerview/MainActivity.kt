package com.taghavi.sectionrecylerview

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var itemArrayList: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.sectioned_recycler_view)
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        val sections: MutableList<Section> = ArrayList()
        //add sections
        for (i in 0..1) {
            itemArrayList = ArrayList()
            //add items to a section
            for (j in 0..4) {
                itemArrayList.add("Item $j Section $i")
            }
            //add the section and items to array list
            sections.add(Section("Section $i", itemArrayList))
        }
        val adapter = SectionAdapter(this, sections)
        recyclerView.adapter = adapter
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            if (itemArrayList.size > 3) {
                adapter.moveItem(0, 1)
            }
        }
    }
}