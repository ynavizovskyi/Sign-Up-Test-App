package com.ynavizovskyi.signuptestapp.session

import com.ynavizovskyi.signuptestapp.doman.entity.Session

class SessionManagerImpl : SessionManager {

    //Emulated storage
    private var session: Session? = null

    override fun saveSession(session: Session) {
        this.session = session
        //emit session
    }

    override fun clearSession() {
        this.session = null
        //emit session
    }

    override fun observeSession() {
        //return session flow
    }
}