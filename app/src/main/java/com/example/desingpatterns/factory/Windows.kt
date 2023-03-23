package com.example.desingpatterns.factory

import android.util.Log

class Windows : OperatingSystem {
    override fun specification() {
        Log.e("TAG", "specification: This is window operating system" )
    }
}