package com.ynavizovskyi.signuptestapp.di

import com.ynavizovskyi.signuptestapp.presentation.ContainerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [FragmentBuilderModule::class])
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun bindMainFragment(): ContainerActivity?


}