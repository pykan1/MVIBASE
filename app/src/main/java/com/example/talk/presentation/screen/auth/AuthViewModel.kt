package com.example.talk.presentation.screen.auth

import androidx.lifecycle.viewModelScope
import com.example.talk.presentation.screen.base.BaseViewModel
import kotlinx.coroutines.flow.Flow

class AuthViewModel: BaseViewModel<AuthState, AuthEvent>() {

    private val reducer = AuthReducer(initial = AuthState(), viewModelScope = viewModelScope)

    override val state: Flow<AuthState>
        get() = reducer.state

    fun send(event: AuthEvent) {

        reducer.sendEvent(event = event)

    }

}