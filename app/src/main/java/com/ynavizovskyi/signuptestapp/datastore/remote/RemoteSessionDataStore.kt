package com.ynavizovskyi.signuptestapp.datastore.remote

import com.ynavizovskyi.signuptestapp.data.SessionData
import com.ynavizovskyi.signuptestapp.data.SessionDataStore
import kotlinx.coroutines.delay
import java.lang.Exception

class RemoteSessionDataStore(private val service: SessionService) : SessionDataStore {

    override suspend fun singIn(email: String, password: String): SessionData {
        //Simulate network delay
        delay(500)
        if(email == "invalid@mail.com"){
            //simulated HttpException
            throw Exception("Invalid email or password")
        }

        return SessionData("wowSuchToken")
    }

    override suspend fun signOut() {
        //simulate successful sign out with network delay
        delay(500)
    }

}