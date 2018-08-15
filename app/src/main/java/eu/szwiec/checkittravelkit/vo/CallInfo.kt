package eu.szwiec.checkittravelkit.vo

import com.squareup.moshi.Json

data class CallInfo(
        @Json(name = "calling_code")
        val callingCode: String = "",
        @Json(name = "police_number")
        val policeNumber: String = "",
        @Json(name = "ambulance_number")
        val ambulanceNumber: String = ""
)