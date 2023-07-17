package com.example.talk.presentation.screen.auth

import androidx.compose.runtime.Immutable
import com.example.talk.presentation.screen.base.UiEvent


@Immutable
sealed class AuthEvent: UiEvent {

    //описание ивентов
    //data class ChangeNumberEvent(val number: String): AuthEvent()

}
