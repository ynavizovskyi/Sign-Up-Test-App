package com.ynavizovskyi.signuptestapp

import android.app.Activity
import android.app.Application
import com.ynavizovskyi.signuptestapp.di.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class SignInApp : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector() = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        initDependencyInjection()
    }

    private fun initDependencyInjection(){
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)

    }

}