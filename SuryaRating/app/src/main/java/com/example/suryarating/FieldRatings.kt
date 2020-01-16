package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_field_ratings.*
import kotlinx.android.synthetic.main.content_field_ratings.*
import kotlinx.android.synthetic.main.content_personal_details_page.*

class FieldRatings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_field_ratings)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        button_field_ratings_next.setOnClickListener { _ ->
            startActivity(Intent(this, RecommendRating::class.java))
        }
    }
}
