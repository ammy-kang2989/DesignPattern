package com.example.desingpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.desingpatterns.adapterPattern.players.MainAudioPlayer
import com.example.desingpatterns.builder.FoodOrder
import com.example.desingpatterns.factory.OSType
import com.example.desingpatterns.factory.OperatingSystem
import com.example.desingpatterns.factory.OperatingSystemFactory
import com.example.desingpatterns.sealedClasses.Shape
import com.example.desingpatterns.sealedClasses.Square
import com.example.desingpatterns.singleton.RetrofitSin

//Design patterns are reusable solutions to the most commonly occurring software problems.
// They can speed up the development process by providing a proven way of resolving frequent issues.

class MainActivity : AppCompatActivity() {
    private lateinit var mainAudioPlayer: MainAudioPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainAudioPlayer = MainAudioPlayer()

        singletonExample()
        factoryExample()
        builderExample()
        adapterPatternExample()

        var circle = Shape.Circle(34.0f)
        var rect = Shape.Rectangle(3, 4)
        var square = Square(10)

        val noShape = Shape.NotAShape
        checkShape(noShape)

    }

    private fun checkShape(shape: Shape) {

        when(shape){
            is Shape.Circle -> {

                Log.e("TAG", "checkShape: circle shape" )
            }

            Shape.NotAShape -> {
                Log.e("TAG", "checkShape: not a shape" )
            }
            is Square -> {
                Log.e("TAG", "checkShape: square shape" )
            }
            is Shape.Rectangle -> {

                Log.e("TAG", "checkShape: rectangle shape" )
            }


        }

    }

    private fun adapterPatternExample() {
        //In this example, we have two interfaces: MediaPlayer and AdvancedMediaPlayer.
        // MediaPlayer defines a play method that takes an audioType and a fileName.
        // AdvancedMediaPlayer defines two methods: playVlc and playMp4.
        //
        //We have two classes that implement AdvancedMediaPlayer: VlcPlayer and Mp4Player.
        // We also have a MediaAdapter class that implements MediaPlayer and
        // has an instance of an AdvancedMediaPlayer.
        // The play method of MediaAdapter takes an audioType and a fileName, and based on the audioType,
        // it calls the appropriate method on the AdvancedMediaPlayer.
        //
        //Finally, we have an AudioPlayer class that implements MediaPlayer.
        // It has an instance of a MediaAdapter and calls its play method when the
        // audioType is vlc or mp4. If the audioType is mp3, it plays the file directly.
        // If the audioType is anything else, it prints an error message.
        //
        //With this implementation, we can use the AudioPlayer to play any type of audio file,
        // whether it's an mp3, vlc, or mp4, without worrying about the underlying implementation
        // details of each file type.

        //* adapter
        //Overall, the Adapter pattern is useful when you need to make two incompatible interfaces work together without modifying either of them. It provides a flexible and reusable solution to interface compatibility issues.
        mainAudioPlayer.play("mp4", "teri_ankho_me_udasi_kabhi_dekh_sakta_nhi")
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