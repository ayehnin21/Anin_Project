package com.coder.mm.annimationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_animations.*

class Animations : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animations)
        btnBounceAni.setOnClickListener(this)
        btnFadeAnin.setOnClickListener(this)
        btnFadeOutAnim.setOnClickListener(this)
        btnRotateAnim.setOnClickListener(this)
        btnSlideDown.setOnClickListener(this)
        btnSlideUPAnim.setOnClickListener(this)
        btnZoomInAni.setOnClickListener(this)
        btnZoomOutAni.setOnClickListener(this)
    }

    private fun showAni(i: Int) {
        val ani = AnimationUtils.loadAnimation(this, i)
        aniImg.animation = ani
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btnBounceAni -> showAni(R.anim.bounce_ani)
            R.id.btnFadeAnin -> showAni(R.anim.fade_in_ani)
            R.id.btnFadeOutAnim -> showAni(R.anim.fade_out_ani)
            R.id.btnRotateAnim -> showAni(R.anim.rotate_ani)
            R.id.btnSlideDown -> showAni(R.anim.slide_down_ani)
            R.id.btnSlideUPAnim -> showAni(R.anim.slide_up_ani)
            R.id.btnZoomInAni -> showAni(R.anim.zoom_in_ani)
            R.id.btnZoomOutAni -> showAni(R.anim.zoom_out_ani)
        }
    }
}
