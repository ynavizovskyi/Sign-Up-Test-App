package com.ynavizovskyi.signuptestapp.di

import android.app.Application
import com.ynavizovskyi.signuptestapp.SignInApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class, AppModule::class, ActivityModule::class]
)
interface AppComponent {

    fun inject(application: SignInApp)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent

    }

}