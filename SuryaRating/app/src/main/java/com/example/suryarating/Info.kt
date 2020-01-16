package com.example.suryarating

import android.app.Application
import android.os.Parcelable

class Info : Application() {
    var patientDepartment : PD? = null
    var patientName : String? = null
    var consultingDoctor : String? = null
    var speciality : String? = null
    var UHID : String? = null
    var dateOfVisit : String? = null
    var contactNumber : String? = null
    var email : String? = null
    var signature : String? = null

    fun clearInfo() {
        patientDepartment = null
        patientName = null
        consultingDoctor = null
        speciality = null
        UHID = null
        dateOfVisit = null
        contactNumber = null
        email = null
        signature = null
    }
}

enum class PD {
    OPD, IPD
}