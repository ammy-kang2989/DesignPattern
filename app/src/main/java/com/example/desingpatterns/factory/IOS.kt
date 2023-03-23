package com.example.desingpatterns.factory

import android.util.Log

class IOS : OperatingSystem{
    override fun specification() {
        Log.e("TAG", "specification: This is an iOS operating system." )
    }

}