package com.example.react_native

import android.app.Application
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.react.shell.MainReactPackage
import com.facebook.soloader.SoLoader

class MyReactApplication : Application(), ReactApplication {

    private val mReactNativeHost = object : ReactNativeHost(this) {
        override fun getUseDeveloperSupport(): Boolean {
            return BuildConfig.DEBUG
        }

        override fun getPackages(): MutableList<ReactPackage> {
            val list = ArrayList<ReactPackage>()
            list.add(MainReactPackage())
            return list
        }

        override fun getJSMainModuleName(): String {
            return "index"
        }

    }

    override fun getReactNativeHost(): ReactNativeHost {
        return mReactNativeHost
    }

}