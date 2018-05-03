package com.jhr.abdallahsarayrah.multirv


import android.os.Bundle
import android.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_image.view.*


/**
 * A simple [Fragment] subclass.
 */
class ImageFragment : DialogFragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_image, container, false)

        view.imageView3.setImageResource(arguments.getInt("num"))

        return view
    }

}// Required empty public constructor
