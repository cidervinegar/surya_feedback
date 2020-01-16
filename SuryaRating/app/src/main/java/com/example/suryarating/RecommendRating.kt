package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recommend_rating.*
import kotlinx.android.synthetic.main.content_field_ratings.*
import kotlinx.android.synthetic.main.content_recommend_rating.*

class RecommendRating : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommend_rating)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        button_recommend_ratings_next.setOnClickListener { _ ->
            startActivity(Intent(this, ServicesPage::class.java))
        }
    }
}
