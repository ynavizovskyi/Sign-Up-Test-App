package com.ynavizovskyi.signuptestapp.di

import com.ynavizovskyi.signuptestapp.data.SessionDataStore
import com.ynavizovskyi.signuptestapp.data.SessionRepositoryImpl
import com.ynavizovskyi.signuptestapp.datastore.remote.RemoteSessionDataStore
import com.ynavizovskyi.signuptestapp.doman.dispatcher.DefaultDispatcherManager
import com.ynavizovskyi.signuptestapp.doman.dispatcher.DispatcherManager
import com.ynavizovskyi.signuptestapp.doman.repository.SessionRepository
import com.ynavizovskyi.signuptestapp.session.SessionManager
import com.ynavizovskyi.signuptestapp.session.SessionManagerImpl
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    //Ideally would be split between different modules


    @Binds
    abstract fun bindDispatcherManager(mana: DefaultDispatcherManager): DispatcherManager

    @Binds
    abstract fun bindRepository(repository: SessionRepositoryImpl): SessionRepository

    @Binds
    abstract fun bindDataStore(dataStore: RemoteSessionDataStore): SessionDataStore

    @Binds
    abstract fun bindSessionManager(manager: SessionManagerImpl): SessionManager

}