package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_visits_page.*
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
        radio_group_how_many_visits.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                 when(checkedId) {
                    R.id.radioButton_once -> info!!.numberOfVisits=NumberOfVisits.Once
                    R.id.radioButton_twice -> info!!.numberOfVisits=NumberOfVisits.Twice
                    R.id.radioButton_thrice -> info!!.numberOfVisits=NumberOfVisits.Thrice
                    R.id.radioButton_4_5_times -> info!!.numberOfVisits=NumberOfVisits.FourFiveTimes
                    R.id.radioButton_6_times_or_more -> info!!.numberOfVisits=NumberOfVisits.SixOrMore
                }
            }

        })

    }

    fun setup() {
        if (info!=null) {
            radio_group_how_many_visits.check(when(info!!.numberOfVisits) {
                null -> 0
                NumberOfVisits.Once -> R.id.radioButton_once
                NumberOfVisits.Twice -> R.id.radioButton_twice
                NumberOfVisits.Thrice -> R.id.radioButton_thrice
                NumberOfVisits.FourFiveTimes ->R.id.radioButton_4_5_times
                NumberOfVisits.SixOrMore -> R.id.radioButton_6_times_or_more
            })
        }
    }
}
