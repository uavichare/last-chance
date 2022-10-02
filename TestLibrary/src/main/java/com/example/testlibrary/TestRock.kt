package com.example.testlibrary

import android.os.Bundle
import com.indooratlas.android.sdk.IALocation
import com.indooratlas.android.sdk.IALocationListener

class TestRock: IALocationListener {
    override fun onLocationChanged(p0: IALocation?) {
        TODO("Not yet implemented")
    }

    override fun onStatusChanged(p0: String?, p1: Int, p2: Bundle?) {
        TODO("Not yet implemented")
    }
}