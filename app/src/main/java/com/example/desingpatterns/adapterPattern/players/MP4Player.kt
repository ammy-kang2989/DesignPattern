package com.example.desingpatterns.adapterPattern.players

import android.util.Log
import com.example.desingpatterns.adapterPattern.playersInterface.AdvancedMediaPlayer

class MP4Player : AdvancedMediaPlayer {
    override fun playVlc(fileName: String) {
        Log.e("TAG", "MP4 player playVlc: fileName = $fileName")
    }

    override fun playMP4(fileName: String) {
        Log.e("TAG", "MP4 player playMP4: fileName = $fileName")
    }
}