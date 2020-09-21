package com.dontsu.appbarscrollex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_item.view.*

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    private var nameList = arrayListOf<String>()

    fun listUpdate(newName : String) {
        nameList.add(newName)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = nameList.size

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_item, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = nameList[position]
        holder.bind(item)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(name : String) {
            itemView.name.text = name
        }
    }


}