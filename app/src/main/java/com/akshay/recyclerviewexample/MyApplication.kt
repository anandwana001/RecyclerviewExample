package com.akshay.recyclerviewexample

import android.app.Application

/**
 * Created by akshaynandwana on
 * 03, October, 2019
 **/

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    fun getDependencies() {

    }

}