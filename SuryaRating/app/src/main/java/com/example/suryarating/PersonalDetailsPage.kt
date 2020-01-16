package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import android.text.TextWatcher
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_personal_details_page.*
import kotlinx.android.synthetic.main.content_personal_details_page.*
import android.text.Editable
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T


class PersonalDetailsPage : AppCompatActivity() {

    val TAG: String = "PersonalDetailsPage"
    var info: Info? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        info = applicationContext as Info
        setContentView(R.layout.activity_personal_details_page)
        setSupportActionBar(toolbar)
        button_personal_details_next.setOnClickListener { _ ->
            startActivity(Intent(this, FieldRatings::class.java))
        }
        setup()

        edittext_patient_name.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                info?.patientName = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })

        edittext_consulting_doctor.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                info?.consultingDoctor = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })

        edittext_speciality.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                info?.speciality = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })

        edittext_uhid.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                info?.UHID = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })

        edittext_date_of_visit.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                info?.dateOfVisit = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })

        edittext_contact_no.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                info?.contactNumber = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })

        edittext_email.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                info?.email = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })

        edittext_signature.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                info?.signature = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
        })
    }

    fun setup() {
        if (info != null) {
            edittext_patient_name.setText(info!!.patientName)
            edittext_consulting_doctor.setText(info!!.consultingDoctor)
            edittext_speciality.setText(info!!.speciality)
            edittext_uhid.setText(info!!.UHID)
            edittext_date_of_visit.setText(info!!.dateOfVisit)
            edittext_contact_no.setText(info!!.contactNumber)
            edittext_email.setText(info!!.contactNumber)
            edittext_signature.setText(info!!.signature)
        }
    }
}
