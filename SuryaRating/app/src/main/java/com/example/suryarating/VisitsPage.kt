package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_visits_page.*
import kotlinx.android.synthetic.main.content_how_long_page.*
import kotlinx.android.synthetic.main.content_visits_page.*

class VisitsPage : AppCompatActivity() {

    var info : Info? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visits_page)
        info = applicationContext as Info
        setSupportActionBar(toolbar)
        setup()
        button_visits_next.setOnClickListener { _ ->
            startActivity(Intent(this, HearOfUsPage::class.java))
        }

    }

    fun setup() {
    }
}
