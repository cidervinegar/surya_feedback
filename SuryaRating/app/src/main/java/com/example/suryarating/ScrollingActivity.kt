package com.example.suryarating

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_scrolling.*
import kotlinx.android.synthetic.main.content_scrolling.*

class ScrollingActivity : AppCompatActivity() {
    private val TAG : String = "Starting activity"
    var info : Info? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        info = applicationContext as Info
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)
        info!!.clearInfo()
        button_ipd.setOnClickListener { _ ->
            Log.d(TAG, "ipd button clicked")
            info!!.patientDepartment = PD.IPD
            val intent = Intent(this, PersonalDetailsPage::class.java)
            startActivity(intent)
        }
        button_opd.setOnClickListener { _ ->
            Log.d(TAG, "opd button clicked")
            info!!.patientDepartment = PD.OPD
            val intent = Intent(this, PersonalDetailsPage::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
