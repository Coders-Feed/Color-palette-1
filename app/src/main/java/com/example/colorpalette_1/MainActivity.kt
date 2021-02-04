package com.example.colorpalette_1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.colorpalette_1.adapters.ColorAdapter


class MainActivity : AppCompatActivity(){
    val recyclerColor=ColorAdapter(arrayListOf())
    private lateinit var  viewModel:ColorViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       val rnC=findViewById<RecyclerView>(R.id.rncolor)
        val currentDay=findViewById<TextView>(R.id.currentDay)
        val currentMonth=findViewById<TextView>(R.id.currentMonth)

        rnC.layoutManager= GridLayoutManager(this, 2)
        rnC.adapter=recyclerColor
        viewModel=
            ViewModelProviders.of(this).get(ColorViewModel::class.java)
            viewModel.refreshData()


        obserLiveData()
    }

    fun obserLiveData(){
        viewModel.colors.observe(this, Observer { colors ->
            colors?.let {
                recyclerColor.updateColorList(colors)
            }
        })
    }
}