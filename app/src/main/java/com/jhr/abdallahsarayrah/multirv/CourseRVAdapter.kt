/*
package com.jhr.abdallahsarayrah.multirv

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

*/
/**
 * Created by abdallah.sarayrah on 1/28/2018.
 *//*


class CourseRVAdapter(private val mContext: Context, data: List<Nugget>?) : RecyclerView.Adapter<CourseRVAdapter.SimpleViewHolder>() {

    class SimpleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        private val horizontalAdapter: HorizontalRVAdapter

        init {
            val context = itemView.context
            title = view.findViewById(R.id.course_item_name_tv) as TextView
            horizontalList = itemView.findViewById(R.id.horizontal_list) as RecyclerView
            horizontalList!!.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            horizontalAdapter = HorizontalRVAdapter()
            horizontalList!!.adapter = horizontalAdapter
        }
    }

    init {
        if (data != null)
            mData = ArrayList(data)
        else
            mData = ArrayList()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.courses_item, parent, false)
        return SimpleViewHolder(view)
    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.title.setText(mData!![position].getTitle())
        holder.horizontalAdapter.setData(mData!![position].getTags()) // List of Strings
        holder.horizontalAdapter.setRowIndex(position)
    }

    override fun getItemCount(): Int {
        return mData!!.size()
    }

    companion object {
        private var mData: List<Nugget>? = null
        private var horizontalList: RecyclerView? = null
    }
}
*/
