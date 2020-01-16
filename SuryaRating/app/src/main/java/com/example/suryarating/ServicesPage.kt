package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import android.widget.CompoundButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_services_page.*
import kotlinx.android.synthetic.main.content_services_page.*

class ServicesPage : AppCompatActivity() {

    var info : Info? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services_page)
        info = applicationContext as Info
        setSupportActionBar(toolbar)
        setup()
        button_services_next.setOnClickListener { _ ->
            startActivity(Intent(this, HowLongPage::class.java))
        }

        checkBoxVaccinations.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    info!!.services.add(Services.Vaccinations)
                }
                else {
                    info!!.services.remove(Services.Vaccinations)
                }
            }
        })

        checkBoxPathology.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    info!!.services.add(Services.Pathology)
                }
                else {
                    info!!.services.remove(Services.Pathology)
                }
            }
        })

        checkBoxRadiology.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    info!!.services.add(Services.Radiology)
                }
                else {
                    info!!.services.remove(Services.Radiology)
                }
            }
        })

        checkBoxCardiology.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    info!!.services.add(Services.Cardiology)
                }
                else {
                    info!!.services.remove(Services.Cardiology)
                }
            }
        })

        checkBoxNeurology.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    info!!.services.add(Services.Neurology)
                }
                else {
                    info!!.services.remove(Services.Neurology)
                }
            }
        })
    }

    fun setup() {
        if (info!= null) {
            info!!.services.forEach {
                service ->
                when(service) {
                    Services.Vaccinations -> checkBoxVaccinations.isChecked = true
                    Services.Pathology -> checkBoxPathology.isChecked = true
                    Services.Radiology -> checkBoxRadiology.isChecked = true
                    Services.Cardiology -> checkBoxCardiology.isChecked = true
                    Services.Neurology -> checkBoxNeurology.isChecked = true
                }
            }

        }
    }
}
