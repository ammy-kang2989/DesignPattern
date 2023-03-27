package com.example.desingpatterns.adapterPattern.adapter

import com.example.desingpatterns.adapterPattern.players.MP4Player
import com.example.desingpatterns.adapterPattern.players.MP3Player
import com.example.desingpatterns.adapterPattern.playersInterface.AdvancedMediaPlayer
import com.example.desingpatterns.adapterPattern.playersInterface.MediaPlayer

class MediaAdapter(private val audioType: String)  : MediaPlayer {

    var advancedMediaPlayer : AdvancedMediaPlayer? = null

    init {
        when(audioType){
            "mp3" ->
                advancedMediaPlayer = MP3Player()
            "mp4" ->
                advancedMediaPlayer = MP4Player()
        }
    }

    override fun play(audioType: String, fileName: String) {

        when(audioType){
            "mp3" ->
                advancedMediaPlayer?.playMp3(fileName)
            "mp4" ->
                advancedMediaPlayer?.playMP4(fileName)
        }
    }
}