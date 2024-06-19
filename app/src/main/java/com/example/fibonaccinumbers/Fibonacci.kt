package com.example.fibonaccinumbers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Fibonacci (var numbersList:List<Int>): RecyclerView.Adapter<NumbersHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.fibonacci_numbers, parent, false)
        return NumbersHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumbersHolder, position: Int) {
        holder.tvNumber1.text = numbersList[position].toString()

    }

    override fun getItemCount(): Int {
        return numbersList.size

    }
}

class NumbersHolder(itemView: View): ViewHolder(itemView){
    var tvNumber1 = itemView.findViewById<TextView>(R.id.tvNumber1)
}