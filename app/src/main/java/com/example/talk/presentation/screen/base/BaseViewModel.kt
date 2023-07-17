package com.example.talk.presentation.screen.base

import androidx.lifecycle.ViewModel
import com.example.talk.presentation.screen.base.UiEvent
import com.example.talk.presentation.screen.base.UiState
import kotlinx.coroutines.flow.Flow

abstract class BaseViewModel<S: UiState, in E: UiEvent>: ViewModel() {

    abstract val state: Flow<S>

}