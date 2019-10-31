package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_bounce.*

class BounceActivity : AppCompatActivity() {

    lateinit var  bounceAnimation: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bounce)
        bounceAnimation= AnimationUtils.loadAnimation(this,R.anim.bounce)
        imgPerson.animation=bounceAnimation
    }
}
