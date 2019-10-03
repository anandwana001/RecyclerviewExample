package com.akshay.recyclerviewexample.di.component

import com.akshay.recyclerviewexample.BlogAdapter
import com.akshay.recyclerviewexample.MainActivity
import com.akshay.recyclerviewexample.di.modules.ActivityModule
import com.akshay.recyclerviewexample.di.scopes.ActivityScope
import dagger.Component

/**
 * Created by akshaynandwana on
 * 03, October, 2019
 **/

@ActivityScope
@Component(modules = [ActivityModule::class] )
interface ActivityComponent {

    fun inject(activity: MainActivity)
}