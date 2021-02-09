package com.ynavizovskyi.signuptestapp.di

import com.ynavizovskyi.signuptestapp.presentation.MainFragment
import com.ynavizovskyi.signuptestapp.presentation.SignInFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    //Should be scoped properly
    @ContributesAndroidInjector
    abstract fun bindSignInFragment(): SignInFragment?

    @ContributesAndroidInjector
    abstract fun bindMainFragment(): MainFragment?

}