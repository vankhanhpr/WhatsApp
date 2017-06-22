package com.example.user.fracment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.thefirst_4.*

/**
 * Created by User on 6/22/2017.
 */
public class thefirst_4kt : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thefirst_4)

        btn_tiep.setOnClickListener(){
            var intent= Intent(this,loginkl::class.java)
            startActivity(intent)
        }
    }
}
