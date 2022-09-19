package com.miminerica.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_message.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainBtn.setOnClickListener {

            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)
        }

        messageBtn.setOnClickListener {
            val myIntent = Intent(this, MessageActivity::class.java)
            val inputMsg = messageTxt.text.toString()

            myIntent.putExtra("msg", inputMsg)

            startActivity()

        }
    }

}