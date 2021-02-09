package com.ynavizovskyi.signuptestapp.doman.usecase

import com.ynavizovskyi.signuptestapp.doman.repository.SessionRepository

class SingInUseCase (private val repository: SessionRepository) {

    suspend operator fun invoke(email: String, password: String){
        repository.singIn(email, password)
    }

}