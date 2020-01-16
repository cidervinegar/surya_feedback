package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hear_of_us_page.*
import kotlinx.android.synthetic.main.content_hear_of_us_page.*

class HearOfUsPage : AppCompatActivity() {

    var info: Info? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hear_of_us_page)
        info = applicationContext as Info
        setSupportActionBar(toolbar)
        setup()
        button_hear_of_us_next.setOnClickListener { _ ->
            startActivity(Intent(this, ThankYou::class.java))
        }

        checkBoxHoardings.setOnCheckedChangeListener(object :
            CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    info!!.heardOfUs.add(HeardOfUs.Hoardings)
                } else {
                    info!!.heardOfUs.remove(HeardOfUs.Hoardings)
                }
            }
        })

        checkBoxNewspapers.setOnCheckedChangeListener(object :
            CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    info!!.heardOfUs.add(HeardOfUs.NewsPapers)
                } else {
                    info!!.heardOfUs.remove(HeardOfUs.NewsPapers)
                }
            }
        })

        checkBoxSocialMedia.setOnCheckedChangeListener(object :
            CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    info!!.heardOfUs.add(HeardOfUs.SocialMedia)
                } else {
                    info!!.heardOfUs.remove(HeardOfUs.SocialMedia)
                }
            }
        })

        checkBoxWebsite.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    info!!.heardOfUs.add(HeardOfUs.Website)
                } else {
                    info!!.heardOfUs.remove(HeardOfUs.Website)
                }
            }
        })

        checkBoxFriends.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    info!!.heardOfUs.add(HeardOfUs.FriendsAndRelatives)
                } else {
                    info!!.heardOfUs.remove(HeardOfUs.FriendsAndRelatives)
                }
            }
        })

        checkBoxRadio.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    info!!.heardOfUs.add(HeardOfUs.Radio)
                } else {
                    info!!.heardOfUs.remove(HeardOfUs.Radio)
                }
            }
        })

        edittext_other_heard_of_us.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                info!!.others = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
        edittext_doctor_ref.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                info!!.doctorsRef = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
        edittext_word_of_mouth.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                info!!.wordOfMouth = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

        })
    }

    fun setup() {
        if (info != null) {
            info!!.heardOfUs.forEach { way ->
                when (way) {
                    HeardOfUs.Hoardings -> checkBoxHoardings.isChecked = true
                    HeardOfUs.NewsPapers -> checkBoxNewspapers.isChecked = true
                    HeardOfUs.SocialMedia -> checkBoxSocialMedia.isChecked = true
                    HeardOfUs.Website -> checkBoxWebsite.isChecked = true
                    HeardOfUs.FriendsAndRelatives -> checkBoxFriends.isChecked = true
                    HeardOfUs.Radio -> checkBoxRadio.isChecked = true
                }
            }
            edittext_other_heard_of_us.setText(info!!.others)
            edittext_doctor_ref.setText(info!!.doctorsRef)
            edittext_word_of_mouth.setText(info!!.wordOfMouth)
        }
    }
}
