package com.example.scalescrollimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val scaleScrollImageView = ScaleScrollImageView(this).apply {
            setImageResource(R.drawable.image_sample)
        }
        constraintLayout.addView(scaleScrollImageView)
    }
}
