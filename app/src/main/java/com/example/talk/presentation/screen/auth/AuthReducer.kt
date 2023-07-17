package com.example.talk.presentation.screen.auth

import com.example.talk.presentation.screen.base.Reducer
import kotlinx.coroutines.CoroutineScope

class AuthReducer(
    initial: AuthState,
    val viewModelScope: CoroutineScope
): Reducer<AuthState, AuthEvent>(initial) {


    override fun reduce(oldState: AuthState, event: AuthEvent) {

//        when(event) {
//
//            is AuthEvent./*какой то ивент */ {
//
//                //какая нибудь приватная функция из AuthReducer
//
//            }
//
//        }
    }
//
//    private fun kakayatoFunction(oldState: AuthState, event: AuthEvent./*Какой то ивент*/) {
//
//        //логика
//
//    }
}