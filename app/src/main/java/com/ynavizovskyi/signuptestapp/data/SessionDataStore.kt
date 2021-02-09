package com.ynavizovskyi.signuptestapp.data

interface SessionDataStore {

    suspend fun singIn(email: String, password: String): SessionData

    suspend fun signOut()

}