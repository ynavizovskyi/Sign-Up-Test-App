package com.ynavizovskyi.signuptestapp.session

import com.ynavizovskyi.signuptestapp.doman.entity.Session

interface SessionManager {

    fun saveSession(session: Session)

    fun clearSession()

    //supposed to be a Flow
    fun observeSession()

}