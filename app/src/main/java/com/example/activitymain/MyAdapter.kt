package com.example.activitymain

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(var context:Context, var data:List<Product>):RecyclerView.Adapter<ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        return ProductHolder(LayoutInflater.from(context).inflate(R.layout.elements, parent, false))
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        when(val product = data[position]){
            is Pack ->{
                holder.infos.text = product.name
                holder.price.text = product.price.toString() + " DA "
                holder.productImage.setImageResource(R.drawable.ic_pack)
            }
            is Smartphone ->{
                holder.infos.text = product.brand + " " + product.name
                holder.color.text = " " +product.model + " - " + product.color
                holder.price.text = product.price.toString() + " DA "
                holder.productImage.setImageResource(R.drawable.phone)
            }
        }
        holder.add.setOnClickListener{
            var qte =Integer.parseInt(holder.quantity.text.toString())
            if(qte<data[position].qte!!) {
                qte++
                holder.quantity.text = qte.toString()
            }
            notifyDataSetChanged()
        }

        holder.min.setOnClickListener{
            var qte =Integer.parseInt(holder.quantity.text.toString())
            if(qte>0) {
                qte--
                holder.quantity.text = qte.toString()
            }
            notifyDataSetChanged()
        }
    }

}