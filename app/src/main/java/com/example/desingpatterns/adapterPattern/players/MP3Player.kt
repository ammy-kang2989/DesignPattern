package com.example.desingpatterns.adapterPattern.players

import android.util.Log
import com.example.desingpatterns.adapterPattern.playersInterface.AdvancedMediaPlayer

class MP3Player : AdvancedMediaPlayer {

    override fun playMp3(fileName: String) {
        Log.e("TAG", "VLCPlayer player playVlc: fileName = $fileName")
    }

    override fun playMP4(fileName: String) {
        TODO("Not yet implemented")
    }

}