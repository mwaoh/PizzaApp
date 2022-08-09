package com.example.pizzaapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class PizzaAdapter(private val pizzaList : ArrayList<Pizza>):RecyclerView.Adapter<PizzaAdapter.PizzaViewHolder>(){

class PizzaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    // This is we fetch views from the layouts our values from XML
    val pizzaImage : ImageView = itemView.findViewById(R.id.iv_pizza)
    val pizzaName : TextView = itemView.findViewById(R.id.tv_pizza_text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaViewHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.pizza_item,parent,false)
        return PizzaViewHolder(viewLayout)
    }

    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) {
        val currentFood = pizzaList[position]
        holder.pizzaImage.setImageResource(currentFood.pizzaImage)
        holder.pizzaName.text = currentFood.pizzaName
    }

    override fun getItemCount() = pizzaList.size
    }
