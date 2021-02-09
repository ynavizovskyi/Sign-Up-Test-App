package com.ynavizovskyi.signuptestapp.presentation.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ynavizovskyi.signuptestapp.doman.usecase.SignOutUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val signOutUseCase: SignOutUseCase) : ViewModel() {

    val logOutLiveData = MutableLiveData<Unit>()

    fun logOut(){
        //I don't have time to implement error handling, so let's just imagine it is implemented :D
        viewModelScope.launch {
            signOutUseCase.invoke()
            logOutLiveData.postValue(Unit)
        }

    }

}