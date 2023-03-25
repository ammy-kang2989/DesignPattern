package com.example.desingpatterns.adapterPattern.adapter

import com.example.desingpatterns.adapterPattern.players.MP4Player
import com.example.desingpatterns.adapterPattern.players.VLCPlayer
import com.example.desingpatterns.adapterPattern.playersInterface.AdvancedMediaPlayer
import com.example.desingpatterns.adapterPattern.playersInterface.MediaPlayer

class MediaAdapter(private val audioType: String)  : MediaPlayer {

    var advancedMediaPlayer : AdvancedMediaPlayer? = null

    init {
        when(audioType){
            "vlc" ->
                advancedMediaPlayer = VLCPlayer()
            "mp4" ->
                advancedMediaPlayer = MP4Player()
        }
    }

    override fun play(audioType: String, fileName: String) {

        when(audioType){
            "vlc" ->
                advancedMediaPlayer?.playVlc(fileName)
            "mp4" ->
                advancedMediaPlayer?.playMP4(fileName)
        }
    }
}