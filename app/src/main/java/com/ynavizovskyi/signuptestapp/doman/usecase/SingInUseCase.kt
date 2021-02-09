package com.ynavizovskyi.signuptestapp.doman.usecase

import com.ynavizovskyi.signuptestapp.doman.repository.SessionRepository
import javax.inject.Inject

class SingInUseCase @Inject constructor (private val repository: SessionRepository) {

    suspend operator fun invoke(email: String, password: String){
        repository.singIn(email, password)
    }

}