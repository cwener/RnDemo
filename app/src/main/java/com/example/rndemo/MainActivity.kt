package com.example.rndemo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.react_native.ReactNativeActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, ReactNativeActivity::class.java))
    }
}