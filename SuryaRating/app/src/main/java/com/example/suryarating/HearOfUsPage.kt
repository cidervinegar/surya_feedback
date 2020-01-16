package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hear_of_us_page.*
import kotlinx.android.synthetic.main.content_hear_of_us_page.*

class HearOfUsPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hear_of_us_page)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        button_hear_of_us_next.setOnClickListener { _ ->
            startActivity(Intent(this, ThankYou::class.java))
        }
    }
}
