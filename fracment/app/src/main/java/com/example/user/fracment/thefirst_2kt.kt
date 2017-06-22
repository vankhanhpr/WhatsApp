package com.example.user.fracment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.thefist_2.*

/**
 * Created by VANKHANHPR on 6/22/2017.
 */


public  class thefirst_2kt : Activity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thefist_2)

        btn_next.setOnClickListener()
        {
            var intent= Intent(this, thefirst_4kt::class.java)
            startActivity(intent)
            //finish()
        }
    }
}