package com.example.desingpatterns.factory

import android.util.Log

class Android : OperatingSystem {

    override fun specification() {
        Log.e("TAG", "specification: this is Android operating system" )
    }
}