package com.coder.mm.annimationproject

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoToBounceAni.setOnClickListener {
           goActivity(BounceActivity())
        }
        btnGoToScale.setOnClickListener {
            goActivity(ScaleAniActivity())
        }
    }


    private fun goActivity(act: Activity){
        startActivity(Intent(this, act::class.java))
    }
}
