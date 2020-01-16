package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_visits_page.*
import kotlinx.android.synthetic.main.content_visits_page.*

class VisitsPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visits_page)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        button_visits_next.setOnClickListener { _ ->
            startActivity(Intent(this, ScrollingActivity::class.java))
            // TODO replace this class with the one we actually want.
        }
    }
}
