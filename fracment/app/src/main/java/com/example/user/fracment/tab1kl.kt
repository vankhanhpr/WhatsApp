package com.example.user.fracment

/**
 * Created by User on 6/21/2017.
 */
import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.tab1.view.*

public class tab1kl : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.tab1, container, false)
        //rootView.section_label.text = getString(R.string.section_format, arguments.getInt(main.PlaceholderFragment.ARG_SECTION_NUMBER))

        return rootView
    }

}
