package com.example.desingpatterns.adapterPattern.players

import android.util.Log
import com.example.desingpatterns.adapterPattern.playersInterface.AdvancedMediaPlayer

class VLCPlayer : AdvancedMediaPlayer {

    override fun playVlc(fileName: String) {
        Log.e("TAG", "VLCPlayer player playVlc: fileName = $fileName")
    }

    override fun playMP4(fileName: String) {
        Log.e("TAG", "VLCPlayer player playMP4: fileName = $fileName")
    }
}