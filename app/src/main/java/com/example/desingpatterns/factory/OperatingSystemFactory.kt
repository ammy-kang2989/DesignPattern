package com.example.desingpatterns.factory

class OperatingSystemFactory {


    fun getInstance(type : OSType): OperatingSystem {
        return when (type) {
            OSType.ANDROID
            -> Android()
            OSType.IOS
            -> IOS()
            OSType.WINDOWS
            -> Windows()
        }


    }
}