package com.jhr.abdallahsarayrah.multirv

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.clothes_view.view.*
import kotlinx.android.synthetic.main.images_view.view.*


/**
 * Created by abdallah.sarayrah on 1/26/2018.
 */
class ClothesAdapter(val context: Context, val list: ArrayList<ClothesModel>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var contextR = this.context
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.clothes_view, parent,
                false)
        return ClothesViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        (holder as ClothesViewHolder).bind(list[position].name, list[position].price, list[position].imgLink)
        val imagesList = ArrayList<ImagesModel>()

        imagesList.add(ImagesModel("clothes1 ay  eshy", R.drawable.cl1))
        imagesList.add(ImagesModel("clothes1 ay  eshy1", R.drawable.cl2))
        imagesList.add(ImagesModel("clothes1 ay  eshy2", R.drawable.cl3))
        imagesList.add(ImagesModel("clothes1", R.drawable.cl4))
        imagesList.add(ImagesModel("clothes1", R.drawable.cl5))
        imagesList.add(ImagesModel("clothes1", R.drawable.cl6))
        imagesList.add(ImagesModel("clothes1", R.drawable.cl1))
        imagesList.add(ImagesModel("clothes1", R.drawable.cl2))
        imagesList.add(ImagesModel("clothes1", R.drawable.cl3))

        holder.itemView.recyclerView_images.adapter = ImagesAdapter(context, imagesList)
        holder.itemView.recyclerView_images.layoutManager = LinearLayoutManager(context,
                LinearLayoutManager.HORIZONTAL, false)


    }

    class ClothesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(n: String, p: Int, l: Int) {
            itemView.textView_name.text = n
            itemView.textView_price.text = p.toString() + " JD"
            itemView.imageView.setImageResource(l)

        }

    }
}