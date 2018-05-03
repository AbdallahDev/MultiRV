package com.jhr.abdallahsarayrah.multirv

import android.app.FragmentManager
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.images_view.view.*
import kotlin.math.ln
import android.app.Activity
import android.os.Bundle


/**
 * Created by abdallah.sarayrah on 1/27/2018.
 */
class ImagesAdapter(val context: Context, val list: ArrayList<ImagesModel>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.images_view, parent, false)
        return ImagesViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        (holder as ImagesViewHolder)
        holder.itemView.textView_image.text = list[position].image1
        holder.itemView.imageView2.setImageResource(list[position].imageLink)

        holder.itemView.imageView2.setOnClickListener {
            val fr = (context as Activity).fragmentManager
            val msgDialog = ImageFragment()
            val args = Bundle()
            args.putInt("num", list[position].imageLink)
            msgDialog.arguments = args
            msgDialog.show(fr, "Dialog")
        }
    }

    class ImagesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        /*fun bind(i: String, lnk: Int) {
//            itemView.textView_image.text = i
            itemView.imageView2.setImageResource(lnk)
        }*/

        fun show() {
        }

    }
}