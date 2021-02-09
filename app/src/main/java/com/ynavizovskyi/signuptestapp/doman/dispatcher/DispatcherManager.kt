package com.ynavizovskyi.signuptestapp.doman.dispatcher

import kotlin.coroutines.CoroutineContext

interface DispatcherManager {

    val io: CoroutineContext
    val ui: CoroutineContext

}