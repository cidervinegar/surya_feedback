package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import android.widget.RadioGroup
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_how_long_page.*
import kotlinx.android.synthetic.main.content_how_long_page.*

class HowLongPage : AppCompatActivity() {

    var info : Info? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_long_page)
        info = applicationContext as Info
        setSupportActionBar(toolbar)
        setup()
        button_how_long_next.setOnClickListener { _ ->
            startActivity(Intent(this, VisitsPage::class.java))
        }
        radio_group_how_long_visiting.setOnCheckedChangeListener(object  : RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                when(checkedId) {
                    R.id.radioButton_first_visit -> info!!.visitingSince = VisitTimes.First
                    R.id.radioButton_6_months -> info!!.visitingSince = VisitTimes.SixMonths
                    R.id.radioButton_1_year -> info!!.visitingSince = VisitTimes.OneYear
                    R.id.radioButton_3_years -> info!!.visitingSince = VisitTimes.ThreeYears
                    R.id.radioButton_more_than_three_years -> info!!.visitingSince = VisitTimes.MoreThanThreeYears
                }
            }

        })
    }

    fun setup() {
        if (info!=null && info!!.visitingSince!=null) {
            radio_group_how_long_visiting.check(when(info!!.visitingSince) {
                VisitTimes.First -> R.id.radioButton_first_visit
                VisitTimes.SixMonths -> R.id.radioButton_6_months
                VisitTimes.OneYear -> R.id.radioButton_1_year
                VisitTimes.ThreeYears -> R.id.radioButton_3_years
                VisitTimes.MoreThanThreeYears -> R.id.radioButton_more_than_three_years
                null -> 0
            })
        }
    }
}
