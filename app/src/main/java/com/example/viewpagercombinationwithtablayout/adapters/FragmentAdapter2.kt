package com.example.viewpagercombinationwithtablayout.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagercombinationwithtablayout.databinding.FragmentItem2Binding
import com.example.viewpagercombinationwithtablayout.databinding.FragmentItemBinding
import com.example.viewpagercombinationwithtablayout.fragments.ItemFragment2
import com.example.viewpagercombinationwithtablayout.models.Data
import com.example.viewpagercombinationwithtablayout.models.Data2

class FragmentAdapter2(val list: List<Data2>) :
    RecyclerView.Adapter<FragmentAdapter2.VH>() {
    inner class VH(var bindingItem: FragmentItem2Binding) :
        RecyclerView.ViewHolder(bindingItem.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(FragmentItem2Binding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }


    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bindingItem.image.setImageResource(list[position].image2)
        holder.bindingItem.bigText.text = list[position].big_text2
        holder.bindingItem.smallText.text = list[position].small_text2
    }

    override fun getItemCount(): Int = list.size
}