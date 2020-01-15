package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_personal_details_page.*
import kotlinx.android.synthetic.main.content_personal_details_page.*

class PersonalDetailsPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_details_page)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        button_personal_details_next.setOnClickListener { _ ->
            startActivity(Intent(this, FieldRatings::class.java))
        }
    }
}
