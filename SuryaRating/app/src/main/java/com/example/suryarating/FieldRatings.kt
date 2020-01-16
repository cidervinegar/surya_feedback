package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import android.widget.RatingBar
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_field_ratings.*
import kotlinx.android.synthetic.main.content_field_ratings.*
import kotlinx.android.synthetic.main.content_personal_details_page.*

class FieldRatings : AppCompatActivity() {

    var info : Info? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        info = applicationContext as Info
        setContentView(R.layout.activity_field_ratings)
        setSupportActionBar(toolbar)
        setup()
        button_field_ratings_next.setOnClickListener { _ ->
            startActivity(Intent(this, RecommendRating::class.java))
        }

        bar_ease_of_booking.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                info!!.ratingEaseOfBooking = rating
            }
        })

        bar_location_rating.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                info!!.ratingLocation = rating
            }
        })

        bar_cleanliness_rating.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                info!!.ratingCleanliness = rating
            }
        })

        bar_transparent_communication.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                info!!.ratingCommunication = rating
            }
        })

        bar_waiting_time.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                info!!.ratingWaitingTime = rating
            }
        })

        bar_care_provided_by_doctor.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                info!!.ratingCareProvidedDoctor = rating
            }
        })

        bar_care_provided_by_nursing.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                info!!.ratingCareProvidedNursingStaff = rating
            }
        })

        bar_hospital_infrastructure.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                info!!.hospitalInfrastructure = rating
            }
        })

        bar_billing_process.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                info!!.ratingBillingProcess = rating
            }
        })

        bar_value_for_money.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                info!!.ratingValueForMoney = rating
            }
        })
    }

    fun setup() {
        if (info != null) {
            bar_ease_of_booking.rating = info!!.ratingEaseOfBooking
            bar_location_rating.rating = info!!.ratingLocation
            bar_cleanliness_rating.rating = info!!.ratingCleanliness
            bar_transparent_communication.rating = info!!.ratingCommunication
            bar_waiting_time.rating = info!!.ratingWaitingTime
            bar_care_provided_by_doctor.rating = info!!.ratingCareProvidedDoctor
            bar_care_provided_by_nursing.rating = info!!.ratingCareProvidedNursingStaff
            bar_hospital_infrastructure.rating = info!!.hospitalInfrastructure
            bar_billing_process.rating = info!!.ratingBillingProcess
            bar_value_for_money.rating = info!!.ratingValueForMoney
        }
    }
}
