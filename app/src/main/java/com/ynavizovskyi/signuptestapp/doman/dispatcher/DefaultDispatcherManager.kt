package com.ynavizovskyi.signuptestapp.doman.dispatcher

import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class DefaultDispatcherManager @Inject constructor() : DispatcherManager {

    override val io: CoroutineContext = Dispatchers.IO
    override val ui: CoroutineContext = Dispatchers.Main

}