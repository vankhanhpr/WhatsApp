package com.example.user.fracment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.thefirst_1.*


/**
 * Created by User on 6/22/2017.
 */
public class thefirst_1kt : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thefirst_1)
        btn_thefirst.setOnClickListener(){
            var intent = Intent(this, thefirst_2kt::class.java)
            startActivity(intent)
            //finish()
        }
    }
}