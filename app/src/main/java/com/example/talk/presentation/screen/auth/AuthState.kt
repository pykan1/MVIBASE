package com.example.talk.presentation.screen.auth

import androidx.compose.runtime.Immutable
import com.example.talk.presentation.screen.base.UiState

@Immutable
data class AuthState(
    val isLoading: Boolean = false,
    //дальше другие параметры, то что будет использоваться для текстового поля делай так
    //val number: MutableState<String> = mutableStateOf("")  чтобы достать значение из number надо написать условно authState.number.value
) : UiState
