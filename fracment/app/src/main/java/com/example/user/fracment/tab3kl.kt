package com.example.user.fracment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by User on 6/21/2017.
 */
public class tab3kl : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.tab1, container, false)
        //rootView.section_label.text = getString(R.string.section_format, arguments.getInt(main.PlaceholderFragment.ARG_SECTION_NUMBER))

        return rootView
    }

}