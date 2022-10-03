package com.isjieman.memberdata.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isjieman.memberdata.Activity.DetailActivity
import com.isjieman.memberdata.Data
import com.isjieman.memberdata.databinding.ItemDataBinding
import org.jetbrains.anko.intentFor

class DataAdapter (val listData: ArrayList<Data>):
    RecyclerView.Adapter<DataAdapter.ListViewHolder>() {

    inner class ListViewHolder(var binding: ItemDataBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Data){
            binding.tvNameList.text = data.name
            binding.tvIdList.text = data.id

            itemView.setOnClickListener {
                itemView.context?.startActivity(
                    itemView.context.intentFor<DetailActivity>()
                )
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
         return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int = listData.size

}