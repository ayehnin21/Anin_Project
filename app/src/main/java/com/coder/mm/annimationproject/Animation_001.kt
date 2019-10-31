package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.R.string.no
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_animation_001.*


class Animation_001 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_001)

        var fadeOut = AlphaAnimation(1f, 0f)
        fadeOut.duration=3000
        imgP.startAnimation(fadeOut)
    }
}
