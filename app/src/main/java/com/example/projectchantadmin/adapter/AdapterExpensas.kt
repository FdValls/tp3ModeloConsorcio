package com.example.projectchantadmin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectchantadmin.R
import com.example.projectchantadmin.entities.Expensas

class AdapterExpensas(
    private var expensasList: MutableList<Expensas>,
    val onItemClick: (Int) -> Boolean
) : RecyclerView.Adapter<HolderExpensas>() {

    override fun getItemCount(): Int {
        return expensasList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderExpensas {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_expensas, parent, false)
        return (HolderExpensas(view))
    }

    override fun onBindViewHolder(holder: HolderExpensas, position: Int) {

        holder.setMes(expensasList[position].mes)
        holder.setTotal(expensasList[position].total)
        holder.setImg(expensasList[position])

        holder.getCardLayout().setOnClickListener {
            onItemClick(position)
        }

    }

    fun setData(newData: ArrayList<Expensas>) {
        this.expensasList = newData
        this.notifyDataSetChanged()
    }


}