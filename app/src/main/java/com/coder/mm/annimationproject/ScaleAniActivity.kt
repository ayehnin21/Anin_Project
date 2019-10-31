package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_scale_ani.*

class ScaleAniActivity : AppCompatActivity() {

    lateinit  var scaleAnin: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scale_ani)
        scaleAnin=AnimationUtils.loadAnimation(this,R.anim.scale)
        tvScale.animation=scaleAnin
    }
}
