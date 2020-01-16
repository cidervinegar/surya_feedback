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

    var ratingEaseOfBooking : Float = 0f
    var ratingLocation : Float = 0f
    var ratingCleanliness : Float = 0f
    var ratingCommunication : Float = 0f
    var ratingWaitingTime : Float = 0f
    var ratingCareProvidedDoctor : Float = 0f
    var ratingCareProvidedNursingStaff : Float = 0f
    var hospitalInfrastructure : Float = 0f
    var ratingBillingProcess : Float = 0f
    var ratingValueForMoney : Float = 0f

    var ratingRecommend : Float = 0f
    var reasonRecommend : String? = null

    var services : ArrayList<Services> = ArrayList()

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

        ratingEaseOfBooking = 0f
        ratingLocation = 0f
        ratingCleanliness = 0f
        ratingCommunication = 0f
        ratingWaitingTime = 0f
        ratingCareProvidedDoctor = 0f
        ratingCareProvidedNursingStaff = 0f
        hospitalInfrastructure = 0f
        ratingBillingProcess = 0f
        ratingValueForMoney = 0f

        ratingRecommend = 0f
        reasonRecommend = null

        services = ArrayList()
    }
}

enum class PD {
    OPD, IPD
}

enum class Services {
    Vaccinations, Pathology, Radiology, Cardiology, Neurology
}