package com.ynavizovskyi.signuptestapp.doman.usecase

import com.ynavizovskyi.signuptestapp.doman.dispatcher.DispatcherManager
import com.ynavizovskyi.signuptestapp.doman.repository.SessionRepository
import kotlinx.coroutines.withContext
import javax.inject.Inject

class SignOutUseCase @Inject constructor(
    private val repository: SessionRepository,
    private val dispatcherManager: DispatcherManager
) {

    suspend operator fun invoke() {
        withContext(dispatcherManager.io){
            repository.signOut()
        }
    }

}