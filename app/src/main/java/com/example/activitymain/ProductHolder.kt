package com.example.activitymain

import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.solver.widgets.Guideline
import androidx.recyclerview.widget.RecyclerView

class ProductHolder(view:View):RecyclerView.ViewHolder(view) {
    val productContainer = view.findViewById<ImageView>(R.id.back) as ImageView
    val infos = view.findViewById<TextView>(R.id.info) as TextView
    val color = view.findViewById<TextView>(R.id.color) as TextView
    val price = view.findViewById<TextView>(R.id.prix) as TextView
    val productImage = view.findViewById<ImageView>(R.id.productType) as ImageView
    val quantity = view.findViewById<TextView>(R.id.quantite) as TextView
    val min = view.findViewById<ImageButton>(R.id.moins) as ImageButton
    val add = view.findViewById<ImageButton>(R.id.plus) as ImageButton
}