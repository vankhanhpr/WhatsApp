package com.example.user.fracment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.user.fracment.R.id.btn_login1
import kotlinx.android.synthetic.main.login.*

public class loginkl : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        btn_login1.setOnClickListener()
        {
            var intent = Intent(this, main::class.java)
            startActivity(intent)
        }
    }
}