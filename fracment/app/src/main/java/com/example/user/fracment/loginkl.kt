package com.example.user.fracment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.login.*

public class loginkl : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        login1.setOnClickListener()
        {
            var intent = Intent(this, thefirst_1kt::class.java)
            startActivity(intent)
            finish()
        }
    }
}