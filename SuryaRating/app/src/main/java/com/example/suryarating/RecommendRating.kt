package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.RatingBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recommend_rating.*
import kotlinx.android.synthetic.main.content_recommend_rating.*

class RecommendRating : AppCompatActivity() {

    var info : Info? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommend_rating)
        info = applicationContext as Info
        setup()
        setSupportActionBar(toolbar)

        button_recommend_ratings_next.setOnClickListener { _ ->
            startActivity(Intent(this, ServicesPage::class.java))
        }

        bar_recommend.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                info!!.ratingRecommend = rating
            }
        })

        edittext_recommend_rating_reason.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                info!!.reasonRecommend = s.toString()
            }

        })
    }

    fun setup() {
        if (info!= null) {
            bar_recommend.rating = info!!.ratingRecommend
            edittext_recommend_rating_reason.setText(info!!.reasonRecommend)
        }
    }
}
