package com.ynavizovskyi.signuptestapp.doman.repository

interface SessionRepository {

    suspend fun singIn(email: String, password: String)

    suspend fun signOut()

}