package com.example.desingpatterns.adapterPattern.players

import com.example.desingpatterns.adapterPattern.adapter.MediaAdapter
import com.example.desingpatterns.adapterPattern.playersInterface.MediaPlayer

class MainAudioPlayer : MediaPlayer {

    lateinit var mediaAdapter: MediaAdapter


    override fun play(audioType: String, fileName: String) {
        mediaAdapter = MediaAdapter(audioType)
        mediaAdapter.play(audioType, fileName)
    }
}