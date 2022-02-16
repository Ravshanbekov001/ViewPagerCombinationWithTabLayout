package com.example.viewpagercombinationwithtablayout.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagercombinationwithtablayout.R
import com.example.viewpagercombinationwithtablayout.databinding.FragmentFirstBinding
import com.example.viewpagercombinationwithtablayout.databinding.FragmentItemBinding
import com.example.viewpagercombinationwithtablayout.fragments.FirstFragment
import com.example.viewpagercombinationwithtablayout.fragments.ItemFragment
import com.example.viewpagercombinationwithtablayout.models.Data
import com.example.viewpagercombinationwithtablayout.models.Data2

class FragmentAdapter(val list: List<Data>) :
    RecyclerView.Adapter<FragmentAdapter.VH>() {
    inner class VH(var bindingItem: FragmentItemBinding) :
        RecyclerView.ViewHolder(bindingItem.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(FragmentItemBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }


    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bindingItem.image.setImageResource(list[position].image)
        holder.bindingItem.bigText.text = list[position].big_text
        holder.bindingItem.smallText.text = list[position].small_text
    }

    override fun getItemCount(): Int = list.size
}
