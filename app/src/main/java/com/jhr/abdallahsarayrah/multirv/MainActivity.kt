package com.jhr.abdallahsarayrah.multirv

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<ClothesModel>()
        list.add(ClothesModel("clothes", 11, R.drawable.cl1))
        list.add(ClothesModel("clothes", 11, R.drawable.cl4))
        list.add(ClothesModel("clothes", 11, R.drawable.cl1))
        list.add(ClothesModel("clothes", 11, R.drawable.cl1))
        list.add(ClothesModel("clothes", 11, R.drawable.cl1))
        list.add(ClothesModel("clothes", 11, R.drawable.cl1))

        val adp = ClothesAdapter(this, list)
        recyclerView_clothes.layoutManager = LinearLayoutManager(this)
        recyclerView_clothes.adapter = adp
    }
}
