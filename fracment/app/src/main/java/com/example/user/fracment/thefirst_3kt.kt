package com.example.user.fracment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Telephony
import android.widget.ImageView

/**
 * Created by VANKHANHPR on 6/22/2017.
 */


public class thefirst_3kt : Activity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thefirst_3_wait)

        var intent= Intent(this, thefirst_4kt::class.java)
        startActivity(intent)
    }
}