package com.example.desingpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.desingpatterns.builder.FoodOrder
import com.example.desingpatterns.factory.OSType
import com.example.desingpatterns.factory.OperatingSystem
import com.example.desingpatterns.factory.OperatingSystemFactory
import com.example.desingpatterns.singleton.RetrofitSin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        singletonExample()
        factoryExample()
        builderExample()

    }

    private fun builderExample() {

        val foodOrder = FoodOrder.Builder(this)
            .bread("white bread")
            .isVeg(false)
            .fish("fish")
            .condiments("olive oil")
            .build()
        foodOrder.getMealType()
    }

    private fun factoryExample() {

        //Factory design pattern
        //In Factory pattern, we create object without exposing the creation logic to the client
        // and refer to newly created object using a common interface.
        val factory : OperatingSystemFactory = OperatingSystemFactory()

        val operatingSystem : OperatingSystem =  factory.getInstance(OSType.IOS)
        val operatingSystem2 : OperatingSystem =  factory.getInstance(OSType.WINDOWS)
        val operatingSystem3 : OperatingSystem =  factory.getInstance(OSType.ANDROID)

        operatingSystem.specification()
        operatingSystem2.specification()
        operatingSystem3.specification()
    }

    fun singletonExample() {
        // Singleton design pattern, no need to create object, one instance of the class is available
        // throught the project
        RetrofitSin.runCode()
    }
}