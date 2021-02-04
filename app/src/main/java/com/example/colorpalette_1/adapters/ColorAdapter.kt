package com.example.colorpalette_1.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.colorpalette_1.R
import com.example.colorpalette_1.modal.Colors
import com.google.android.material.snackbar.Snackbar

class ColorAdapter (val colorList:ArrayList<Colors>): RecyclerView.Adapter<ColorAdapter.ColorViewHolder>(){

    inner class ColorViewHolder(
        itemview:View
    ):RecyclerView.ViewHolder(itemview)
    {

    }
    override fun onCreateViewHolder(
          p0: ViewGroup,
          p1: Int): ColorViewHolder
    {
        val inflater=LayoutInflater.from(p0.context)
        val view=inflater.inflate(R.layout.color_item,p0,false)
        return ColorViewHolder(view)
    }
    override fun getItemCount(): Int {
        return colorList.size
    }
    override fun onBindViewHolder(
        holder: ColorViewHolder,
        index: Int)
    {
        holder.itemView.findViewById<TextView>(R.id.color_codeText).text=
                colorList[index].colorCode
        val colorCard=holder.itemView.findViewById<CardView>(R.id.color_card)
        colorCard.setCardBackgroundColor(Color.parseColor(
            colorList[index].colorCode.toString()))

        holder.itemView.setOnClickListener {
         Snackbar.make(it,
                 "${colorList[index].colorCode.toString()} " +
                         "Copied to clipboard",
                 Snackbar.LENGTH_SHORT)
                .show()
        }

    }

    fun updateColorList(newColorsList:List<Colors>){
        colorList.clear()
        colorList.addAll(newColorsList)
        notifyDataSetChanged()
    }

}
