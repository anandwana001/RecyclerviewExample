package com.akshay.recyclerviewexample.di.modules

import android.app.Activity
import android.content.Context
import com.akshay.recyclerviewexample.BlogAdapter
import com.akshay.recyclerviewexample.di.qualifier.ActivityContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by akshaynandwana on
 * 03, October, 2019
 **/

@Module
class ActivityModule(val activity: Activity) {

    @Provides
    fun provideAdapter() = BlogAdapter()


}