package com.kritsana_dev.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R.id.*;
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // init object
        val btn_up = findViewById(R.id.btn_up) as Button
        val btn_down = findViewById(R.id.btn_down) as Button
        val tv_result = findViewById(R.id.tv_result) as TextView
        var result = 0

        btn_up.setOnClickListener {
            // task up number
            result++ // เพิ่มค่า result ทีละ 1
            tv_result.text = result.toString()  // set ค่า tv_result
        }

        btn_down.setOnClickListener {
            // task up number
            result-- // เพิ่มค่า result ทีละ 1
            tv_result.text = result.toString()  // set ค่า tv_result
        }
    }
}