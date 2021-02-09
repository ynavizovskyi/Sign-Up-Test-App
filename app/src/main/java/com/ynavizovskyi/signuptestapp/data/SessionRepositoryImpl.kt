package com.ynavizovskyi.signuptestapp.data

import com.ynavizovskyi.signuptestapp.common.REMOTE
import com.ynavizovskyi.signuptestapp.doman.repository.SessionRepository
import com.ynavizovskyi.signuptestapp.session.SessionManager
import javax.inject.Inject
import javax.inject.Named

class SessionRepositoryImpl @Inject constructor(
    @Named(REMOTE) private val remoteStore: SessionDataStore,
    private val sessionManager: SessionManager
) : SessionRepository {

    override suspend fun singIn(email: String, password: String) {
        val session = remoteStore.singIn(email, password)
        sessionManager.saveSession(session.toDomain())
    }

    override suspend fun signOut() {
        remoteStore.signOut()
        sessionManager.clearSession()
    }
}