package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_thank_you.*
import kotlinx.android.synthetic.main.content_thank_you.*

class ThankYou : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thank_you)
        setSupportActionBar(toolbar)
        button_fill_another_form.setOnClickListener { _ ->
            val intent = Intent(this, ScrollingActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}
