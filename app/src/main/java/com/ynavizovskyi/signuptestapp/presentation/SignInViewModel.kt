package com.ynavizovskyi.signuptestapp.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ynavizovskyi.signuptestapp.doman.usecase.SingInUseCase
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

class SignInViewModel @Inject constructor(private val signInUseCase: SingInUseCase) : ViewModel() {

    //very simplified representation
    //ideally would be some resource to represent loading/success/failure states
    val signInLiveData: MutableLiveData<Boolean> = MutableLiveData()

    val handler = CoroutineExceptionHandler { _, exception ->
        signInLiveData.value = false
    }

    fun signIn(email: String, password: String){
        viewModelScope.launch(handler) {
            signInUseCase.invoke(email, password)
            signInLiveData.value = true
        }
    }

}