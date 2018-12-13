package com.example.ykamikawa.sampleforcircleci

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        computeButton.setOnClickListener {
            resultTextView.text = computeBmi(heightEditText.text.toString().toDouble() / 100, weightEditText.text.toString().toDouble()).toString()
        }
    }

    private fun computeBmi(height_m: Double, weight_kg: Double): Double {
        return weight_kg / (height_m * height_m)
    }
}
