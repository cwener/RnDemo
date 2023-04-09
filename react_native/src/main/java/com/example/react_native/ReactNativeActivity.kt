package com.example.react_native

import com.facebook.react.ReactActivity

class ReactNativeActivity: ReactActivity() {
    override fun getMainComponentName(): String? {
        return "TextInANest"
    }
}